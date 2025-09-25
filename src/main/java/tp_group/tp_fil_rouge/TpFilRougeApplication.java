package tp_group.tp_fil_rouge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class TpFilRougeApplication {

    public static void main(String[] args) {

        SpringApplication.run(TpFilRougeApplication.class, args);

        List<String> messageList = List.of("Hello", "LSI", "2025-26");

        for(String message : messageList) {
            System.out.println(message);
        }
    }
}
