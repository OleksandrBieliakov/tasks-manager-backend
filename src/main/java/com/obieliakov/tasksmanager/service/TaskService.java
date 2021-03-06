package com.obieliakov.tasksmanager.service;

import com.obieliakov.tasksmanager.dto.statusupdate.NewStatusUpdateDto;
import com.obieliakov.tasksmanager.dto.statusupdate.StatusUpdateDto;
import com.obieliakov.tasksmanager.dto.task.*;
import com.obieliakov.tasksmanager.model.Task;

import java.util.List;

public interface TaskService {

    Task taskModelById(Long id);

    TaskDto taskById(Long id);

    TaskDto createTask(NewTaskDto newTaskDto);

    TaskDto updateTaskInfo(Long id, UpdateTaskInfoDto updateTaskInfoDto);

    void deleteTask(Long id);

    StatusUpdateDto updateTaskStatus(Long id, NewStatusUpdateDto newStatusUpdateDto);

    TaskStatusUpdatesDto taskStatusUpdates(Long id);

    TaskAssignmentsDto taskAssignments(Long id);

    TaskCommentsDto taskComments(Long id);

    List<TaskShortInfoDto> allTasks();
}
