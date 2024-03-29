package com.testinc.tasks.repository;

import com.testinc.tasks.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
