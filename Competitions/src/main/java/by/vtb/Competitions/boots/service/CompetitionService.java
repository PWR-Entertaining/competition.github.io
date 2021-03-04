package by.vtb.Competitions.boots.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.vtb.Competitions.boots.entity.Competition;
import by.vtb.Competitions.boots.repository.CompetitionRepository;

@Service
public class CompetitionService {
    @Autowired
    CompetitionRepository competitionRepository;
    
    public boolean save (Competition competition) {
        try {
            competitionRepository.save(competition);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    
    public boolean delete(Competition competition) {
        try {
            competitionRepository.delete(competition);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public List<Competition> findAll() {
        return competitionRepository.findAll();
    }
    
    public Competition findById(Competition competition) {
        return competitionRepository.findById(competition.getId());
    }
}
