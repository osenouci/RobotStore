package lu.innoviction.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/***
 * Configure the server to use basic authentication.
 * All the routes should be defined as public except for the methods used to add and delete a given robot.
 * An extra method called login has been added to authenticate a given user.
 * @author OthmaneSENOUCI
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/***
	 * Configures the server to allow access to all pages except for POST and DELETE methods for '/robot' and POST for 'login' requests
	 * @param http
	 */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        	.csrf().disable().authorizeRequests()
            .antMatchers(HttpMethod.POST  , "/robot").authenticated()	// Used to add a robot.
            .antMatchers(HttpMethod.DELETE, "/robot").authenticated()	// Used to delete a robot.
            .antMatchers(HttpMethod.POST  , "/login").authenticated()	// Used to check if the user credentials are correct or not.
            .anyRequest().permitAll()
            .and().httpBasic();
    }

    /***
     * Creates a test credentials username/password and assign that them the role of an 'ADMIN'.
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	auth.inMemoryAuthentication().withUser("username").password("password").roles("ADMIN");
    }	
	
}
