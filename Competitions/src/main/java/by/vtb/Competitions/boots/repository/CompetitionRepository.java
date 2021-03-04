package by.vtb.Competitions.boots.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.vtb.Competitions.boots.entity.Competition;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Integer>  {
    List<Competition> findAll();
    
    Competition findById(int id);
}
