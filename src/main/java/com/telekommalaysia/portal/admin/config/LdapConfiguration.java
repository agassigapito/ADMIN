package com.telekommalaysia.portal.admin.config;

import java.util.List;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;

@Configuration
public class LdapConfiguration {
	
	@Bean
    public LdapContextSource contextSource(){
        LdapContextSource contextSource = new LdapContextSource();
        contextSource.setUrl("ldap://172.16.1.31:3268/dc=shcsbg,dc=net");
        contextSource.setUserDn("shcsbg\\ACN.ADService");
        contextSource.setPassword("P@$$w0rd");
        return contextSource;
    }

    @Bean
    public LdapTemplate ldapTemplate(){
        LdapTemplate template = new LdapTemplate(contextSource());
        return template;
    }
    
    public Boolean authenticateUser(String username, String password) {
    	
    	LdapTemplate ldapTemplate = new LdapTemplate(contextSource());
    	
    	AndFilter filter = new AndFilter();
    	filter.and(new EqualsFilter("sAMAccountName", username));

    	Boolean authenticate = ldapTemplate.authenticate("OU=SHC Users", filter.encode(), password);
    	
    	return authenticate;
    }
    
   public List<String> verifyUser(String username) {
    	
    	LdapTemplate ldapTemplate = new LdapTemplate(contextSource());
    	
    	AndFilter filter = new AndFilter();
    	filter.and(new EqualsFilter("sAMAccountName", username));

    	//Boolean authenticate = ldapTemplate.authenticate("OU=SHC Users", filter.encode(), password);
    	List<String> listofPositie = ldapTemplate.search("OU=SHC Users", filter.encode(),  new AttributesMapper<String>() {
            public String mapFromAttributes(Attributes attrs)
                    throws NamingException {
                    return (String) attrs.get("cn").get();
                 }
              });
    	return listofPositie;
    }


}
