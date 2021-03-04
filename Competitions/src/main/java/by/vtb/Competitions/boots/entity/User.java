package by.vtb.Competitions.boots.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "user")
public class User implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String firstname;
    private String lastname;
    private String sex;
    private Date dateBirth;
    private String post;
    private String password;
   
    @Transient
    private String passwordConfirm;
    
    public String getPassword() {
        return password;
    }
    
    public int getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getSex() {
        return sex;
    }
    public Date getDateBirth() {
        return dateBirth;
    }
    public String getPost() {
        return post;
    }
    public String getPasswordConfirm() {
        return passwordConfirm;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
    public boolean isAccountNonExpired() {
        return true;
    }
    public boolean isAccountNonLocked() {
        return true;
    }
    public boolean isCredentialsNonExpired() {
        return true;
    }
    public boolean isEnabled() {
        return true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
