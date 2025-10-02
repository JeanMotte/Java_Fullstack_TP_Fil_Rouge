package tp_group.tp_fil_rouge.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tp_group.tp_fil_rouge.model.Programmeur;
import tp_group.tp_fil_rouge.repository.ProgrammeurRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tp_fil_rouge")
public class ProgrammerController {
    private final ProgrammerService programmerService; // dependency injection

    public ProgrammerController(ProgrammerService programmerService) { // constructor
        this.programmerService = programmerService;
    }

//        Programmer p1 = new Programmer(1,"Stroustrup","Bjarne","Laboratoires BELL","C++","The C++ Programming Language",100110.1);
//        Programmer p2 = new Programmer(2,"Gosling","James","1 Oak Avenue","Java","The Java Programming Language",101010.1);

//    public ProgrammerController(ProgrammeurRepository programmeurRepository) {
//        this.programmeurRepository = programmeurRepository;
//    }

    @GetMapping("/programmer")
    public List<Programmeur> displayProgrammers() {
        return programmerService.displayAllProgrammers();
    };

    @GetMapping("/programmer/{id}")
//    public ResponseEntity<?> getProgrammerById(@PathVariable int id) {
//        return programmerService.getProgrammerById(id)
//                .<ResponseEntity<?>>map(ResponseEntity::ok)
//                .orElseGet(() -> ResponseEntity.status(404).body("Ce programmeur n'existe pas"));
//    }
    public Optional<Programmeur> getProgrammerById(@PathVariable int id) {
        return programmerService.getProgrammerById(id);
    }

    @DeleteMapping("/programmer/{id}")
    public ResponseEntity<Void> deleteProgrammerById(@PathVariable int id) {
        if (programmerService.deleteProgrammerById(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/programmer")
    public ResponseEntity<Programmeur> createProgrammer(@RequestBody Programmeur programmer) {
        Programmeur createdProgrammer = programmerService.createProgrammer(programmer);
        return new ResponseEntity<>(createdProgrammer, HttpStatus.CREATED);
    }

    @PutMapping("/programmer/{id}")
    public ResponseEntity<Programmeur> updateProgrammer(@PathVariable int id, @RequestBody Programmeur programmerDetails) {
        return programmerService.updateProgrammer(id, programmerDetails)
                .map(updatedProgrammer -> ResponseEntity.ok(updatedProgrammer))
                .orElse(ResponseEntity.notFound().build());
    }
}
