package org.mysql.service;

public interface UserService {
    void createUser(String name, Integer age);
    
    void deleteByName(String name);
    
    Integer getAllUsers();
    
    void deleteAllUsers();
}
