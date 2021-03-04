package by.vtb.Competitions.boots.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import by.vtb.Competitions.boots.service.UserService;


@Configuration
@EnableWebSecurity
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserService userService;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        
        
        httpSecurity
                .csrf()
                    .disable()
                .authorizeRequests()
                    .antMatchers("/", "/resources/**").permitAll()
                    .antMatchers("/registration_first").not().fullyAuthenticated()
                    .antMatchers("/reg_fin").not().fullyAuthenticated()
                    .antMatchers("/registration_second").not().fullyAuthenticated()
                    .antMatchers("/registration").not().fullyAuthenticated()
                    .antMatchers("/login_fin").not().fullyAuthenticated()  
                    .antMatchers("/").fullyAuthenticated()
                .anyRequest().authenticated()
                .and()
                    .formLogin()
                    .loginPage("/login")
                    .defaultSuccessUrl("/")
                    .permitAll()
                .and()
                    .logout()
                    .permitAll()
                    .logoutSuccessUrl("/login");
    }
    
    
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**","/js/**","/fonts/**","/images/**");
    }
    
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(bCryptPasswordEncoder());
    }

}