package com.dimik.dimikspring.repository;

import com.dimik.dimikspring.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
