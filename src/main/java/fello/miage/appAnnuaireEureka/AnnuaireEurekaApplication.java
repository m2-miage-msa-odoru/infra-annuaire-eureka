package fello.miage.appAnnuaireEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AnnuaireEurekaApplication {
	public static void main(String[] args) {

        SpringApplication.run(AnnuaireEurekaApplication.class, args);
	}

}
