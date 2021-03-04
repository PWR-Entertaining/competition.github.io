package by.vtb.Competitions.boots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.vtb.Competitions.boots.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    
    User findByUsernameAndPassword(String username, String password);
}
