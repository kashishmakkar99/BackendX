package com.bigmakk.task_tracker.repositories;

import com.bigmakk.task_tracker.entities.Task;
import com.bigmakk.task_tracker.entities.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TaskRepository  extends JpaRepository<Task,Long> {

    List<Task>findByTitle(String title);
    List<Task>findByStatus(TaskStatus status);

    List<Task>findByCreatedAt(LocalDateTime createdAt);

    List<Task>findByCreatedAtBetween(LocalDateTime start,LocalDateTime end);

    List<Task>findByTitleAndStatus(String title,TaskStatus status);

    List<Task>findByTitleContaining(String titleKeyword);

    @Query("Select  t from Task t")
    List<Task>getAllTask();

    @Query("Select t from Task t where ID=?1 and taskStatus=?2")
    Task getById(long id,TaskStatus status);
}
