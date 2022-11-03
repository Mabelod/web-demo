package comexamplewebdemo.service;

import comexamplewebdemo.entity.User;
import comexamplewebdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(Integer id) {
        return userRepository.getById(id);
    }

    public void deleteUserById(Integer id) {
        userRepository.getById(id);
    }
}
