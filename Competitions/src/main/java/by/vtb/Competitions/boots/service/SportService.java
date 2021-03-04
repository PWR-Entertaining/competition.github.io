package by.vtb.Competitions.boots.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.vtb.Competitions.boots.entity.Sport;
import by.vtb.Competitions.boots.repository.SportRepository;

@Service
public class SportService {
    @Autowired
    SportRepository sportRepository;
    
    public List<Sport> findAll(){
        return sportRepository.findAll();
    }
    
    public Sport findById(Sport sport) {
        return sportRepository.findById(sport.getId());
    }
    
    public boolean save(Sport sport) {
        try {
            sportRepository.save(sport);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    
    public boolean delete(Sport sport) {
        try {
            sportRepository.delete(sport);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
