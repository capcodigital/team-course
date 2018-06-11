package com.capco.digital.engineering.user;

import static org.junit.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.capco.digital.engineering.common.NotFoundException;

@ContextConfiguration(classes = { UserConfig.class })
public class UserIntTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private UserController controller;

	public List<User> getUsers() {
		ResponseEntity<List<User>> response = controller.getUsers();
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		return response.getBody();
	}

	public User getUser(String userId) {
		ResponseEntity<User> response = controller.getUser(userId);
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		return response.getBody();
	}

	public User postUser(User user) {
		ResponseEntity<User> response = controller.addUser(user);
		assertEquals(response.getStatusCode(), HttpStatus.CREATED);
		return response.getBody();
	}

	public void deleteUser(String id) {
		ResponseEntity<User> response = controller.deleteUser(id);
		assertEquals(response.getStatusCode(), HttpStatus.NO_CONTENT);
	}

	@Test(enabled = false)
	public void testPostUser() {

		String firstname = "test";
		String lastname = "name";

		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);

		postUser(user);

		List<User> users = getUsers();
		assertEquals(users.get(0).getFirstname(), firstname);
		assertEquals(users.get(0).getLastname(), lastname);
		assertNotNull(users.get(0).getId());

		deleteUser(users.get(0).getId());

	}

	@Test(enabled = false)
	public void testGetUser() {

		String firstname = "test";
		String lastname = "name";

		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);

		User postedUser = postUser(user);

		User getUser = getUser(postedUser.getId());
		assertEquals(getUser.getFirstname(), firstname);
		assertEquals(getUser.getLastname(), lastname);
	}

	@Test
	public void testInvalidUserId() {
		try {
			getUser("123");
			fail();
		} catch (NotFoundException e) {

		}
	}
}
