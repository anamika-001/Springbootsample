package springbootsamplehrr.applicationcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({ "springbootsamplehrr.controller" })
@EntityScan({"springbootsamplehrr.model"})
@EnableJpaRepositories({"springbootsamplehrr.dao"})
public class SpringBootSampleHrrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleHrrApplication.class, args);
	}

}
