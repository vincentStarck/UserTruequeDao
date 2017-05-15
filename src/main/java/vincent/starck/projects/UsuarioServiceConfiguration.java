package vincent.starck.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"vincent.starck.projects"})

public class UsuarioServiceConfiguration {
	 public static void main(String[] args) {
	        SpringApplication.run(UsuarioServiceConfiguration.class, args);
	    }

}
