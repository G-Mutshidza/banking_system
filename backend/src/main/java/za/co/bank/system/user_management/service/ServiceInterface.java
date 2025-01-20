package za.co.bank.system.user_management.service;

import za.co.bank.system.user_management.entity.User;

import java.util.List;

public interface ServiceInterface {
    User findUserById(Long id);
    List<User> findAllUsers();
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);

}
