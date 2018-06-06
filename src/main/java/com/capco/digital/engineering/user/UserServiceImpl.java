package com.capco.digital.engineering.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserSequenceService userSequenceService;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User insertUser(User user) {
        user.setId(userSequenceService.getNextSequence("userSequences"));
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById("" + id);
    }

    @Override
    public User findUser(String id) {
        return userRepository.findById(id).orElse(null);
    }

}
