package by.vtb.Competitions.boots.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.vtb.Competitions.boots.entity.Trainer;
import by.vtb.Competitions.boots.repository.TrainerRepository;

@Service
public class TrainerService {
    @Autowired
    TrainerRepository trainerRepository;
    
    public boolean saveTrainer(Trainer trainer) {
        try {
            trainerRepository.save(trainer);
            return true;
        }catch(Exception e) {
            return false;
        }
    }
    
    public boolean deleteTrainer(Trainer trainer) {
        try {
            trainerRepository.delete(trainer);
            return true;
        }catch(Exception e) {
            return false;
        }
    }

    public Optional<Trainer> findTrainerById(Trainer trainer) {
        return trainerRepository.findById(trainer.getId());
    }
    public List<Trainer> findAllTrainers() {
        return trainerRepository.findAll();
    }
    
}
