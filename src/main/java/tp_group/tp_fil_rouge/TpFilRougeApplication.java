package tp_group.tp_fil_rouge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class TpFilRougeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpFilRougeApplication.class, args);
    }

    @GetMapping("/")
    public List<String> getStrings() {
        return List.of("Hello", "LSI", "T2/2025-26");
    }

}
