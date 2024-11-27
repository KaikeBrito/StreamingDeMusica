package com.example.streamingdemusicas.services;

import com.example.streamingdemusicas.entities.User;
import com.example.streamingdemusicas.repositories.UserRepository;
import jakarta.jws.soap.SOAPBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Transactional(readOnly = true)
    public User insertUser(User user){
        return userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public User updateUser(User newUser, Long id){
        return userRepository.findById(id)
                .map(employee -> {
                    employee.setName(newUser.getName());
                    employee.setAge(newUser.getAge());
                    return userRepository.save(newUser);
                })
                .orElseGet(() -> userRepository.save(newUser));
    }
}
