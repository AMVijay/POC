package poc.vijay.spring.beanCreationOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanCreationOrderApplication implements CommandLineRunner{

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(BeanCreationOrderApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		for (String name : context.getBeanDefinitionNames()) {
	        System.out.println(name);
	    }		
	}	
		
}
