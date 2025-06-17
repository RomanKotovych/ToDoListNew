package com.kotovych.todolistnew.service;

import com.kotovych.todolistnew.dto.UserTo;
import com.kotovych.todolistnew.mapping.Dto;
import com.kotovych.todolistnew.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserTo get(long id) {
        return Dto.MAPPER.toDto(userRepository.findById(id).orElse(null));
    }

    public UserTo create(UserTo entity) {
        return Dto.MAPPER.toDto(userRepository.save(Dto.MAPPER.toEntity(entity)));
    }

    public UserTo update(UserTo entity) {
        return Dto.MAPPER.toDto(userRepository.save(Dto.MAPPER.toEntity(entity)));
    }

    public void delete(UserTo entity) {
        userRepository.delete(Dto.MAPPER.toEntity(entity));
    }

    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

    public boolean exists(long id) {
        return userRepository.existsById(id);
    }
}
