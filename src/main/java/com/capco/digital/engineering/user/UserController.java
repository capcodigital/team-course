package com.capco.digital.engineering.user;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capco.digital.engineering.common.NotFoundException;

@RestController
public class UserController {

	private static final Logger logger = LogManager.getLogger(UserController.class);

	private final static String USERS_BASE_ENDPOINT = "/users";
	private final static String USERS_ID = "/{userId}";
	private final static String NEW_USER_TOPIC = "test";

	@Autowired
	private KafkaTemplate<Integer, String> kafkaTemplate;

	@Autowired
	private UserService userService;

	@RequestMapping(value = USERS_BASE_ENDPOINT, method = RequestMethod.GET)
	public ResponseEntity<List<User>> getUsers() {

		return new ResponseEntity<List<User>>(userService.findAllUsers(), HttpStatus.OK);

	}

	@RequestMapping(value = USERS_BASE_ENDPOINT + USERS_ID, method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable String userId) {

		User user = userService.findUser(userId);
		if (user == null) {
			logger.error("UserController");
			throw new NotFoundException();
		}

		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

	@RequestMapping(value = USERS_BASE_ENDPOINT, method = RequestMethod.POST)
	public ResponseEntity<User> addUser(@RequestBody User user) {

		sendMessage("New User Alert!");

		return new ResponseEntity<User>(userService.insertUser(user), HttpStatus.CREATED);

	}

	@RequestMapping(value = USERS_BASE_ENDPOINT, method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteUser(@PathVariable String id) {

		userService.deleteUser(id);
		return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);

	}

	public void sendMessage(String msg) {
		kafkaTemplate.send(NEW_USER_TOPIC, msg);
	}

}
