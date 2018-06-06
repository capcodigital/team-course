package com.capco.digital.engineering.user;

import java.util.List;

public interface UserService {

    public List<User> findAllUsers();

    public User findUser(String id);

    public User insertUser(User user);

    public void deleteUser(String id);
}
