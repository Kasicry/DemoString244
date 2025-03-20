package me.kasi.demospring244;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
public class Demospring244Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demospring244Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);

//       SpringApplication.run(Demospring244Application.class, args);
    }

}
