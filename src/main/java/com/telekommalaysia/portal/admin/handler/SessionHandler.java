package com.telekommalaysia.portal.admin.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.handler.MappedInterceptor;

import com.telekommalaysia.portal.admin.constant.Constants;
import com.telekommalaysia.portal.admin.service.ConfigTableService;
import com.telekommalaysia.portal.admin.service.SessionTokenService;

//@Component
public class SessionHandler extends HandlerInterceptorAdapter {

	@Autowired
	private SessionTokenService sessionTokenService;

	@Autowired
	private ConfigTableService configTableService;

	private static final Logger log = LoggerFactory.getLogger(SessionHandler.class);

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		String header = req.getHeader(Constants.SESSION_TOKEN);

		//log.debug("Pre handle method - check handling start time");
		long startTime = System.currentTimeMillis();
		req.setAttribute("executionTime", startTime);
		if (SessionHandler.isUserLogged()) {
			log.debug("Time since last request in this session: {} ms "
					+ (System.currentTimeMillis() - req.getSession().getLastAccessedTime()));
			if (configTableService.isSwitchedOn(Constants.ADMIN_SESSION_MANAGEMENT_ID)) {
				if (!sessionTokenService.validateSessionToken(header) || header == null) {
					log.info("Logging out, due to inactive session");
					SecurityContextHolder.clearContext();
					res.setStatus(401);
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView model)
			throws Exception {
		//log.debug("Post handle method - check execution time of handling");
		//long startTime = (Long) request.getAttribute("executionTime");
		//log.debug("Execution time for handling the request was: {} ms" + (System.currentTimeMillis() - startTime));
	}

	public static boolean isUserLogged() {
		try {
			return !SecurityContextHolder.getContext().getAuthentication().getName().equals("anonymousUser");
		} catch (Exception e) {
			return false;
		}
	}

	@Bean
	public MappedInterceptor myInterceptor() {
		return new MappedInterceptor(null, new SessionHandler());
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}
}
