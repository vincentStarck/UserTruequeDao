package vincent.starck.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@EnableConfigurationProperties
@SpringBootApplication(scanBasePackages={"vincent.starck.projects","vincent.starck.projects.model"})
public class UsuarioServiceConfiguration {
	 public static void main(String[] args) {
	        SpringApplication.run(UsuarioServiceConfiguration.class, args);
	    }

}
