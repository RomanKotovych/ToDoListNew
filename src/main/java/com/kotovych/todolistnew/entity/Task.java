package com.kotovych.todolistnew.entity;

import com.kotovych.todolistnew.enums.TaskState;
import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TaskState state;
    private String name;
    private String description;
}
