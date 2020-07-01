package com.example.dispenser;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TenantScope implements Scope {
    private Map<String, Object> scopedObjects
      = Collections.synchronizedMap(new HashMap<String, Object>());
    private Map<String, Runnable> destructionCallbacks
      = Collections.synchronizedMap(new HashMap<String, Runnable>());


    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if(!scopedObjects.containsKey(name)) {
            scopedObjects.put(name, objectFactory.getObject());
        }
        //System.out.println(scopedObjects);
        return scopedObjects.get(name);
    }

    @Override
    public Object remove(String name) {
        //System.out.println(scopedObjects);
        return scopedObjects.remove(name);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        destructionCallbacks.put(name, callback);
    }

    @Override
    public Object resolveContextualObject(String name) {
        destructionCallbacks.remove(name);
        return scopedObjects.remove(name);
    }

    @Override
    public String getConversationId() {
        return "tenant";
    }
}