package by.vtb.Competitions.boots.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import by.vtb.Competitions.boots.entity.User;
import by.vtb.Competitions.boots.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        
        if (user==null) {
            throw new UsernameNotFoundException("User not found");
        }
        
        return user;
    }
    
    public boolean saveUser(User user) {
        User userFromDB = userRepository.findByUsername(user.getUsername());
        if(userFromDB == null) {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            userRepository.save(user);
            return true;
        }
        return false;
    }
    
    public User findByEmailAndPassword(User user) {
        System.out.println("тут3");
        
        User userFromDB = userRepository.findByUsernameAndPassword(user.getUsername(), bCryptPasswordEncoder.encode(user.getPassword()));
        
        if (userFromDB==null) {
            throw new UsernameNotFoundException("User not found");
        }
        
        System.out.println("тут4");
        
        return userFromDB;
    }
    
    public User findByUsernameAndPassword(User user) {
        System.out.println("тут4");
        
        User userFromDB = userRepository.findByUsernameAndPassword(user.getUsername(), bCryptPasswordEncoder.encode(user.getPassword()));
        
        if (userFromDB==null) {
            throw new UsernameNotFoundException("User not found");
        }
        
        System.out.println("тут5");
        
        return userFromDB;
    }
    
    
}
