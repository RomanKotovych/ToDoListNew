package com.kotovych.todolistnew.controller.api.v1;

import com.kotovych.todolistnew.constants.UriConstants;
import com.kotovych.todolistnew.dto.UserTo;
import com.kotovych.todolistnew.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(UriConstants.API+UriConstants.REST_VERSION_1+UriConstants.USERS)
public class UserRestController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserTo> create(@RequestBody UserTo userTo) {
        return new ResponseEntity<>(userService.create(userTo), HttpStatus.CREATED);
    }
}
