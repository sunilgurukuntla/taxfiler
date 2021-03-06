package com.company.taxfiler.controller;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.taxfiler.dao.UserEntity;
import com.company.taxfiler.model.RegistraionModel;
import com.company.taxfiler.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class LoginController {

	private Logger LOGGER = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private HttpServletResponse response;

	@PostMapping("/login")
	public Object loginUser(@RequestBody RegistraionModel loginModel) {

		JSONObject jsonResponse = new JSONObject();

		/**
		 * 1. validate (username and password) 2. If username and password is correct go
		 * through the BUSINESS LOGIC 3. Else show the error message
		 */
		try {
			UserEntity userEntity = userRepository.findByEmail(loginModel.getEmail());
			if (null != userEntity) {
				if (userEntity.getPassword().equals(loginModel.getPassword())) {
					jsonResponse.put("username", userEntity.getName());
					jsonResponse.put("id", userEntity.getId());
					jsonResponse.put("email",userEntity.getEmail());
					jsonResponse.put("phone",userEntity.getPhone());
					return jsonResponse.toMap();
				} else {
					response.setStatus(HttpStatus.BAD_REQUEST.value());
					jsonResponse.put("error", "username/password dont match");
					LOGGER.error(jsonResponse.toString());
					return jsonResponse.toMap();
				}
			} else {
				response.setStatus(HttpStatus.BAD_REQUEST.value());
				jsonResponse.put("error", "user not registered");
				LOGGER.error(jsonResponse.toString());
				return jsonResponse.toMap();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
