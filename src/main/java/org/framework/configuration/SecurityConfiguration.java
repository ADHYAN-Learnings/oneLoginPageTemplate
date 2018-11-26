

package org.framework.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		String password = passwordEncoder().encode("aditya");
		authenticationManagerBuilder.inMemoryAuthentication()
		         .withUser("aditya@gmail.com")
		         .password(password)
		         .authorities("USER");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().requireCsrfProtectionMatcher(new AntPathRequestMatcher("**/login"))
		    .and()
		    .authorizeRequests().antMatchers("/user").hasRole("USER")
		    .and().formLogin().defaultSuccessUrl("/user/dashboard").loginPage("/login")
		    .and()
		    .logout().logoutSuccessUrl("/login");
           
	}
}
