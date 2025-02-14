package uk.ac.bradford.mkamra11.webinterfaceforinteractingwithassets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebinterfaceforinteractingwithassetsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebinterfaceforinteractingwithassetsApplication.class, args);
    }

}
