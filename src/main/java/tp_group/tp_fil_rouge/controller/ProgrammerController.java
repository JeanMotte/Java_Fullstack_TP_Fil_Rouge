package tp_group.tp_fil_rouge.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import tp_group.tp_fil_rouge.model.Programmeur;
import tp_group.tp_fil_rouge.repository.ProgrammeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tp_fil_rouge")
public class ProgrammerController {
    private final ProgrammerService programmerService;

    public ProgrammerController(ProgrammerService programmerService) {
        this.programmerService = programmerService;
    }

//        Programmer p1 = new Programmer(1,"Stroustrup","Bjarne","Laboratoires BELL","C++","The C++ Programming Language",100110.1);
//        Programmer p2 = new Programmer(2,"Gosling","James","1 Oak Avenue","Java","The Java Programming Language",101010.1);

//    @Autowired
//    ProgrammeurRepository programmeurRepository; // dependency injection

    @GetMapping("/hello")
    public List<Programmeur> displayProgrammers() {
        return programmerService.displayAllProgrammers();
    };

    @GetMapping("/{id}")
    public ResponseEntity<?> getProgrammerById(@PathVariable int id) {
        return programmerService.getProgrammerById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(404).body("Ce programmeur n'existe pas"));
    }
}
