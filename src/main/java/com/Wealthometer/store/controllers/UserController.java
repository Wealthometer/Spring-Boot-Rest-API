package com.Wealthometer.store.controllers;

import com.Wealthometer.store.dtos.UserDto;
import com.Wealthometer.store.entities.User;
import com.Wealthometer.store.mappers.UserMapper;
import com.Wealthometer.store.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

//    public UserController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    //    @RequestMapping ("/users")
    @GetMapping
//    method: GET
    public Iterable<UserDto> getAllUsers() {
        return userRepository.findAll().
                stream().
                map(userMapper::toDto).
                toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto>  getUser(@PathVariable Long id) {
        var user = userRepository.findById(id).orElse(null);
        if (user == null) {
//           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            return ResponseEntity.notFound().build();
        }

//       return new ResponseEntity<>(user, HttpStatus.OK);
//        var userDto = new UserDto(user.getId(), user.getName(), user.getEmail());
        return ResponseEntity.ok(userMapper.toDto((user)));
    }
}
