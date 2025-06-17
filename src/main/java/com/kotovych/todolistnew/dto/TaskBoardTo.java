package com.kotovych.todolistnew.dto;

import com.kotovych.todolistnew.entity.Task;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.kotovych.todolistnew.entity.TaskBoard}
 */
@Value
public class TaskBoardTo implements Serializable {
    Long id;
    String title;
    List<TaskTo> taskList;
}