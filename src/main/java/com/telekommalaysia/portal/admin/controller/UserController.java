package com.telekommalaysia.portal.admin.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telekommalaysia.portal.admin.constant.Constants;
import com.telekommalaysia.portal.admin.dto.AdminDTO;
import com.telekommalaysia.portal.admin.dto.ResponseDTO;
import com.telekommalaysia.portal.admin.jwt.TokenProvider;
import com.telekommalaysia.portal.admin.service.AdminAssignedRolesService;

@RestController
public class UserController {
	
	//private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired private AdminAssignedRolesService adminAssignedRolesService;
	@Autowired private AuthenticationManager authenticationManager;
	@Autowired private TokenProvider tokenProvider;
	

	@PostMapping(value = "/portallogin", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> verifyCredentials(HttpServletResponse response,@RequestBody AdminDTO dto) {
		//String email = dto.getEmail();
		String password = dto.getPassword();
		String sAMAccountName = dto.getsAMAccountName();
		
		ResponseDTO responseDto = adminAssignedRolesService.login(sAMAccountName, password);

		if (HttpStatus.OK.equals(responseDto.getResponseStatus())) {
			
			AdminDTO namedto = adminAssignedRolesService.getName(sAMAccountName);
			
			String jwt = tokenProvider.createToken(sAMAccountName);
			response.addHeader(Constants.AUTHORIZATION_HEADER, "Bearer " + jwt);
			
			Authentication authentication =  this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(sAMAccountName, password));
			SecurityContextHolder.getContext().setAuthentication(authentication);
		
			return new ResponseEntity<AdminDTO>(namedto, HttpStatus.OK);

		} else {
			ResponseEntity<ResponseDTO> responseEntity = new ResponseEntity<>(responseDto,responseDto.getResponseStatus());

			return responseEntity;
		}

	}
	
//	@PostMapping(value="/express")
//	public Boolean authenticate(@RequestBody AdminDTO dto) {
//		
//		String email = dto.getEmail();
//		String password = dto.getPassword();
//		
//		Boolean isAuthenticated = ldapConfiguration.authenticateUser(email, password);
//		System.out.println("AUTHENTICATION: " + isAuthenticated);
//		
//		return isAuthenticated;
//		
//		
//	}
	// @Autowired
	// private intranetUserRepository userRepository;
	// //@RequestBody UserDto dto,RedirectAttributes redirect
	// //String firstName,@RequestParam String lastName,@RequestParam String
	// email,@RequestParam String password
	// @PostMapping(value="/getTry",produces = "application/json")
	// public String saveUser(@RequestBody UserDto dto,RedirectAttributes redirect)
	// {
	// System.out.println(dto.getFirstName());
	//// intranetUser user = new intranetUser();
	//// user.setFirstName(dto.getFirstName());
	//// user.setLastName(dto.getLastName());
	//// user.setEmail(dto.getEmail());
	//// user.setPassword(dto.getPassword());
	//// userRepository.save(user);
	//
	// return "Just try";
	// }
	// //@RequestParam Long id
	// @GetMapping(value="/getUser")
	// public intranetUser getuser() {
	// intranetUser user = new intranetUser();
	// user.setEmail("steve@gmail.com");
	// user.setFirstName("steve");
	// user.setLastName("valerio");
	// user.setMiddleName("lechuga");
	// user.setPassword("wow");
	// user.setUserId(1l);
	// return user;
	// //return userRepository.findOne(id);
	// }

	//
	// @Autowired
	// private PasswordEncoder passwordEncoder;
	//
	// @Autowired
	// private UserService userService;
	//
	//
	//
	// @RequestMapping(value="/", method=RequestMethod.GET)
	// public ModelAndView defaultUrl() {
	// ModelAndView model = new ModelAndView();
	// Authentication authentication =
	// SecurityContextHolder.getContext().getAuthentication();
	// model.addObject("username", authentication != null ? authentication.getName()
	// : "Not Logged In");
	// model.setViewName("index");
	// return model;
	// }
	// @RequestMapping(value="/user", method=RequestMethod.GET)
	// public ModelAndView user() {
	// ModelAndView model = new ModelAndView();
	// UserDto userDTO = new UserDto();
	// model.addObject("user", userDTO);
	// model.setViewName("register");
	// return model;
	// }
	//
	// @RequestMapping(value = "/create-user", method = RequestMethod.POST)
	// public String createUser(@ModelAttribute UserDto dto,RedirectAttributes
	// redirect){
	// User user = new User();
	// user.setFirstName(dto.getFirstName());
	// user.setLastName(dto.getLastName());
	// user.setEmail(dto.getEmail());
	// user.setPassword(passwordEncoder.encode(dto.getPassword()));
	// userService.save(user);
	// System.out.println(user.toString());
	// return "redirect:"+"http://localhost:8080/user";
	// }

	//
	// @RequestMapping(value = "/create-user", method = RequestMethod.POST)
	// public String createUser(@ModelAttribute UserDto dto,RedirectAttributes
	// redirect){
	// intranetUser user = new intranetUser();
	// user.setFirstName(dto.getFirstName());
	// user.setLastName(dto.getLastName());
	// user.setEmail(dto.getEmail());
	// user.setPassword(passwordEncoder.encode(dto.getPassword()));
	// userService.save(user);
	// System.out.println(user.toString());
	// return "login";
	// }
	//
	// @RequestMapping(value="/user", method=RequestMethod.GET)
	// public ModelAndView user() {
	// ModelAndView model = new ModelAndView();
	// UserDto userDTO = new UserDto();
	// model.addObject("user", userDTO);
	// model.setViewName("register");
	// return model;
	// }
	//

	// @RequestMapping(value="/Response", method=RequestMethod.POST)
	// public ResponseEntity<?> getUser() {
	// ResponseEntity<?> responseEntity = new ResponseEntity<>("String",
	// HttpStatus.OK);
	// return responseEntity;
	// }
	//

	// @RequestMapping(value = "/login", method = RequestMethod.GET)
	// public String getLogin(RedirectAttributes redirect) throws IOException {
	// ModelAndView model = new ModelAndView();
	// model.setViewName("login");
	// return "Successfully logged in";
	// }

	// @Autowired
	// private RestTemplate restsTemplate;
	//
	// @Autowired
	// private PasswordEncoder passwordEncoder;

	// @PostMapping(value = "/getSingleRole")
	// public Roles getSingleRole(@RequestBody Roles roles) {
	// Integer id = roles.getRoleId();
	// return rolesRepository.findOne(id);
	// }
	// @DeleteMapping(value = "/deleteRole")
	// public Roles deleteById(@RequestBody Integer roleId) {
	//
	// Roles existingRoles = rolesRepository.findOne(roleId);
	// rolesRepository.delete(existingRoles);
	// return existingRoles;
	// }

	// @PutMapping(value = "/activateOrDeactiveRole")
	// public Roles activateRole(@RequestBody Integer roleId, @RequestBody Roles
	// roles) {
	// Roles existingRoles = rolesRepository.findOne(roleId);
	// BeanUtils.copyProperties(roles, existingRoles);
	// return rolesRepository.saveAndFlush(existingRoles);
	// }

	// @PutMapping(value = "/updateRole")
	// public ResponseEntity<?> update(@RequestBody AdminDto dto, @RequestBody Roles
	// roles) {
	// Roles existingRoles = rolesRepository.findOne(dto.getId());
	// BeanUtils.copyProperties(roles, existingRoles);
	// rolesRepository.saveAndFlush(existingRoles);
	// ResponseEntity<?> responseEntity = new ResponseEntity<>(null, HttpStatus.OK);
	// return responseEntity;
	// }

	// ----------------------------------ManageRoleFilter-----------

}
