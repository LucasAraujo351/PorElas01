package com.example.loginauthapi.service;

import com.example.loginauthapi.domain.user.User;
import com.example.loginauthapi.dto.UserDTO;
import com.example.loginauthapi.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword())); 
        return userRepository.save(user);
    }

    public Optional<User> findUserById(String id) {
        return userRepository.findById(id);
    }

    public User updateUser(String id, UserDTO userDTO) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User user = existingUser.get();
            if (userDTO.name() != null) user.setName(userDTO.name());
            if (userDTO.email() != null) user.setEmail(userDTO.email());
            if (userDTO.password() != null && !userDTO.password().isEmpty()) {
                user.setPassword(passwordEncoder.encode(userDTO.password())); // Codifica a senha
            }
            return userRepository.save(user);
        }
        throw new RuntimeException("User not found");
    }

    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }
}
