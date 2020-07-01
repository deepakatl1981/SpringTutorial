package com.example.demo;

import com.example.dispenser.Dispenser;
import com.example.dispenser.PetrolDispenser;
import com.example.dispenser.TenantBean;
import com.example.dispenser.TenantScope;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class DemoApplication implements CommandLineRunner {
	@Autowired
	ConfigurableBeanFactory context;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scope tenantScope = new TenantScope();
		context.registerScope("tenant", tenantScope);
		/*PetrolDispenser pDispenser1= context.getBean(PetrolDispenser.class);
		pDispenser1.dispense();
		PetrolDispenser pDispenser2= context.getBean(PetrolDispenser.class);
		pDispenser2.dispense();

		TenantBean tBean1 = context.getBean(TenantBean.class);
		tBean1.print();

		tenantScope.remove("tenantBean");


		TenantBean tBean2 = context.getBean(TenantBean.class);
		tBean2.print();
		tBean1.print();*/
		TenantBean tBean2 = context.getBean(TenantBean.class);
		tBean2.print();

	}
}
