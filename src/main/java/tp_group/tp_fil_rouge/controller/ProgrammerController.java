package tp_group.tp_fil_rouge.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tp_fil_rouge")
public class ProgrammerController {

    @GetMapping("/hello")
    public List<Programmer> displayProgrammers() {
        Programmer p1 = new Programmer(1,"Stroustrup","Bjarne","Laboratoires BELL","C++","The C++ Programming Language",100110.1);
        Programmer p2 = new Programmer(2,"Gosling","James","1 Oak Avenue","Java","The Java Programming Language",101010.1);

//        List<String> messageList = List.of("Hello", "LSI", "2025-26");
//
//        for(String message : messageList) {
//            System.out.println(message);
//        }
//
//        return messageList;
        List<Programmer> listProgrammer = List.of(p1, p2);

        for (Programmer p : listProgrammer)
        {
            System.out.println(p);
        }

        return listProgrammer;
    };
}
