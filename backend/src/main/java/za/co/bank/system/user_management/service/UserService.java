package za.co.bank.system.user_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import za.co.bank.system.user_management.entity.User;
import za.co.bank.system.user_management.repository.UserRepository;
import java.util.List;

@Service
public class UserService implements ServiceInterface{

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User createUser(User user) {
        String hashedPwd = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(hashedPwd);

        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        String hashedPwd = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(hashedPwd);

        return userRepository.save(user);
    }
}
