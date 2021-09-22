package example.quickstart.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{

	
	
	@Bean
	protected UserDetailsService userDetailService() {

		List<UserDetails> users = new ArrayList<>();

		users.add(User.withDefaultPasswordEncoder().username("satti").password("satti").roles("USER").build());
		return new InMemoryUserDetailsManager(users);

	}
	/**
	 * DataBase Level Username and password Credentails.
	 * @return
	
	@Bean
	public AuthenticationProvider authProvider() {
		
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		return null;
		
	}
	
	 */
}
