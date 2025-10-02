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
    private final ProgrammeurRepository programmeurRepository;

    public ProgrammerService(ProgrammeurRepository programmeurRepository) {
        this.programmeurRepository = programmeurRepository;
    }

    public List<Programmeur> displayAllProgrammers() {
        return programmeurRepository.findAll();
    };

    public Optional<Programmeur> getProgrammerById(int id) {
        Optional<Programmeur> programmer = programmeurRepository.findById(id);

        if (programmer.isPresent()) {
            return programmer;
        }
        throw new IllegalStateException("Programmer not found");
    }

    public boolean deleteProgrammerById(int id) {
        if (programmeurRepository.existsById(id)) {
            programmeurRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Programmeur createProgrammer(Programmeur programmer) {
        return programmeurRepository.save(programmer);
    }

    public Optional<Programmeur> updateProgrammer(int id, Programmeur programmerDetails) {
        return programmeurRepository.findById(id).map(existingProgrammer -> {
            existingProgrammer.setNom(programmerDetails.getNom());
            existingProgrammer.setPrenom(programmerDetails.getPrenom());
            existingProgrammer.setAdresse(programmerDetails.getAdresse());
            existingProgrammer.setLangage(programmerDetails.getLangage());
            existingProgrammer.setLivre(programmerDetails.getLivre());
            existingProgrammer.setSalaire(programmerDetails.getSalaire());
            return programmeurRepository.save(existingProgrammer);
        });
    }
}
