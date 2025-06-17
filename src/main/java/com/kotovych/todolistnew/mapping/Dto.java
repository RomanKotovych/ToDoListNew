package com.kotovych.todolistnew.mapping;

import com.kotovych.todolistnew.dto.TaskBoardTo;
import com.kotovych.todolistnew.dto.TaskTo;
import com.kotovych.todolistnew.dto.UserTo;
import com.kotovych.todolistnew.entity.Task;
import com.kotovych.todolistnew.entity.TaskBoard;
import com.kotovych.todolistnew.entity.User;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = {Dto.class})
public interface Dto {
    Dto MAPPER = Mappers.getMapper(Dto.class);

    User toEntity(UserTo userTo);

    UserTo toDto(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(UserTo userTo, @MappingTarget User user);

    Task toEntity(TaskTo taskTo);

    List<Task> toEntity(List<TaskTo> taskTo);

    TaskTo toDto(Task task);

    List<TaskTo> toDto(List<Task> task);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Task partialUpdate(TaskTo taskTo, @MappingTarget Task task);

    TaskBoard toEntity(TaskBoardTo taskBoardTo);

    TaskBoardTo toDto(TaskBoard taskBoard);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)TaskBoard partialUpdate(TaskBoardTo taskBoardTo, @MappingTarget TaskBoard taskBoard);
}
