package com.dimik.dimikspring.repository;

import com.dimik.dimikspring.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {
}