package vijay.poc.spring.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"vijay.poc.spring.rest"})
@EnableWebMvc
public class SpringConfiguration {

}
