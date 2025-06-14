package com.kotovych.todolistnew.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.kotovych.todolistnew.entity.User}
 */
@Value
public class UserTo implements Serializable {
    long id;
    String username;
    String password;
    List<TaskBoardTo> taskBoardList;
}