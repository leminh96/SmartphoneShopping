package com.leminh.configuration;

import com.leminh.authentication.MyDBAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMethod;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	MyDBAuthenticationService myDBAauthenticationService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// User in MEMORY

		auth.inMemoryAuthentication().withUser("user1").password("12345").roles("USER");
		auth.inMemoryAuthentication().withUser("admin1").password("12345").roles("ADMIN");

		// User in DB
		auth.userDetailsService(myDBAauthenticationService);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		//Non-login request
		http.authorizeRequests().antMatchers("/", "/welcome", "/logout").permitAll();
		//Login request
		http.authorizeRequests().antMatchers("/userInfo", "/smartphoneList").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");
		// For ADMIN only.
		http.authorizeRequests().antMatchers("/deleteSmartphone", "/editSmartphone", "/createSmartphone", "/multiDelete", "/saveSmartphone").access("hasRole('ROLE_ADMIN')");
		// User can't access
		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
		// Login form configuration
		http.authorizeRequests().and().formLogin()
				.loginProcessingUrl("/j_spring_security_check")
				.loginPage("/login")
				.defaultSuccessUrl("/welcome", true)
				.failureUrl("/login?error=true")
				.usernameParameter("username")
				.passwordParameter("password")
				// Logout page configuration
				.and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");
	}
}
