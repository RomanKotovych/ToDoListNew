package com.kotovych.todolistnew.dto;

import com.kotovych.todolistnew.enums.TaskState;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.kotovych.todolistnew.entity.Task}
 */
@Value
public class TaskTo implements Serializable {
    Long id;
    TaskState state;
    String name;
    String description;
}