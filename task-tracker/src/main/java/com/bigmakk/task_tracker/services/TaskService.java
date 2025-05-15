package com.bigmakk.task_tracker.services;

import com.bigmakk.task_tracker.entities.Task;
import com.bigmakk.task_tracker.entities.TaskStatus;
import com.bigmakk.task_tracker.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(Task task){
        task.setTaskStatus(TaskStatus.IN_PROGRESS);
        Task savedTask=taskRepository.save(task);
        return savedTask;
    }

    public List<Task> getAllTasks(){
        List<Task>alltasks=taskRepository.findAll();
        return  alltasks;
    }

    public Task getById(Long id){
        Task task=taskRepository.findById(id).orElseThrow(()->new RuntimeException("Task not found for id:"+id));
        return task;
    }

    public void deleteById(Long id){
        Task taskToBeDeleted=getById(id);
        taskRepository.delete(taskToBeDeleted);
    }

    public List<Task> getTasksByStatus(TaskStatus taskStatus){
        return taskRepository.findByStatus(taskStatus);
    }

    public List<Task> getTasksByCreatedDate(LocalDateTime createdAt){
        return taskRepository.findByCreatedAt(createdAt);
    }

    public List<Task> getByTitle(String title){
        return taskRepository.findByTitleContaining(title);
    }


}
