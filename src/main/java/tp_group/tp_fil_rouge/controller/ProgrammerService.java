package tp_group.tp_fil_rouge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tp_group.tp_fil_rouge.model.Programmeur;
import tp_group.tp_fil_rouge.repository.ProgrammeurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProgrammerService {

    @Autowired
    ProgrammeurRepository programmeurRepository;

    public List<Programmeur> displayAllProgrammers() {
        return programmeurRepository.findAll();
    };

    public Optional<Programmeur> getProgrammerById(int id) {
        return programmeurRepository.findById(id);
    }
}
