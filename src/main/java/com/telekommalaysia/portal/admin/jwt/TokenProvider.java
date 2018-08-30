package com.telekommalaysia.portal.admin.jwt;

import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.telekommalaysia.portal.admin.constant.Constants;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;

@Component
public class TokenProvider {

	private final Logger logger = LoggerFactory.getLogger(TokenProvider.class);
	
	@PostConstruct
	public void init() {
		//this.secretKey ="12345678abcdefghijklmn";
		//this.tokenValidityInMilliseconds = 1000 * 86400;
	}

	public String createToken(String username) {
		return Jwts.builder()
				.setSubject(username)
				.setExpiration(new Date(System.currentTimeMillis() + Constants.EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS512, Constants.SECRET.getBytes())
				.compact();

	}

	public Authentication getAuthentication(String token) {
		if (token != null) {
			// parse the token.
			String user = Jwts.parser()
					.setSigningKey(Constants.SECRET.getBytes())
					.parseClaimsJws(token.replace(Constants.TOKEN_PREFIX, ""))
					.getBody()
					.getSubject();

			if (user != null) {
				return new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
			}
			return null;
		}
		return null;
	}

	public boolean validateToken(String authToken) {
		try {
			Jwts.parser().setSigningKey(Constants.SECRET).parseClaimsJws(authToken);
			return true;
		} catch (SignatureException e) {
			logger.info("Invalid JWT signature: " + e.getMessage());
			return false;
		}
	}
}
