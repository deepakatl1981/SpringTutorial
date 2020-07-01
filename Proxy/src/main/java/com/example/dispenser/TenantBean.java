package com.example.dispenser;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "tenant")
public class TenantBean {

    @Value( "${jdbc.url}" )
    private String jdbcUrl;
    public void print(){
        System.out.println("Tenant jdbc url= " + jdbcUrl);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy Tenant = " + this);
    }
}
