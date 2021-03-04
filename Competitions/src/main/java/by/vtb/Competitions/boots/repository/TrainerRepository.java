package by.vtb.Competitions.boots.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.vtb.Competitions.boots.entity.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>  {
    List<Trainer> findAll();
    
    Trainer findById();
    
    Trainer findByDocumentTrainer(String documentTrainer);
}
