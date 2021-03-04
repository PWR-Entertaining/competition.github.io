package by.vtb.Competitions.boots.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.vtb.Competitions.boots.entity.Sport;

@Repository
public interface SportRepository extends JpaRepository<Sport, Integer>  {
    List<Sport> findAll();
    
    Sport findById(int id);
}
