package com.telekommalaysia.portal.admin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.telekommalaysia.portal.admin.constant.Constants;
import com.telekommalaysia.portal.admin.jwt.CORSFilter;
import com.telekommalaysia.portal.admin.jwt.JWTAuthenticationFilter;
import com.telekommalaysia.portal.admin.jwt.JWTAuthorizationFilter;
import com.telekommalaysia.portal.admin.jwt.TokenProvider;


@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true,	 proxyTargetClass=true)
public class ApplicationSecurity extends WebSecurityConfigurerAdapter{

	@Autowired private TokenProvider tokenProvider;
	@Autowired private CustomAuthenticationProvider customAuthProvider;

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/v2/api-docs", 
				"/configuration/ui",
				"/swagger-resources",
				"/swagger-resources/**",
				"/configuration/security",
				"/swagger-ui.html",
				"/webjars/**");
	} 

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.csrf().disable().headers().frameOptions().disable()
		//http.headers().frameOptions().sameOrigin().httpStrictTransportSecurity().disable
		
		http.csrf().disable();
		http.cors()
		.and()
		.authorizeRequests()
		.antMatchers("/").access("hasRole('ROLE_USER')")
		.antMatchers(HttpMethod.POST, Constants.SIGN_IN_URL).permitAll()
		.antMatchers(HttpMethod.POST, Constants.SWAGGER).permitAll()
		.antMatchers(HttpMethod.GET, Constants.LOV).permitAll()
		.antMatchers(HttpMethod.GET, "/api/getAdminMessage").permitAll()
		.anyRequest().authenticated()
		.and()
		//.apply(securityConfigurerAdapter())
		//.and()
		.addFilter(new JWTAuthenticationFilter(authenticationManager()))
		.addFilter(new JWTAuthorizationFilter(authenticationManager()))
		.addFilterBefore(new CORSFilter(), UsernamePasswordAuthenticationFilter.class)

		// this disables session creation on Spring Security
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth)  throws Exception {
		auth.authenticationProvider(customAuthProvider);
	}

	/*private JWTConfigurer securityConfigurerAdapter() {
		return new JWTConfigurer(tokenProvider);
	}*/

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
		return source; 
	}
}
