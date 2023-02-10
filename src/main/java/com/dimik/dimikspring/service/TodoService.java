package com.dimik.dimikspring.service;

import com.dimik.dimikspring.entity.TodoEntity;
import com.dimik.dimikspring.entity.UserEntity;
import com.dimik.dimikspring.model.Todo;
import com.dimik.dimikspring.repository.TodoRepo;
import com.dimik.dimikspring.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;
    @Autowired
    private UserRepo userRepo;

    public Todo createTodo(TodoEntity todo, Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo complete(Long id) {
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return Todo.toModel(todoRepo.save(todo));
    }
}