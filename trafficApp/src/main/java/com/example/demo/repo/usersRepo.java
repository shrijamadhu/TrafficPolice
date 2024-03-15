package com.example.demo.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.users;

public interface usersRepo extends CrudRepository<users, Integer> {
    users findByUsername(@Param("username") String username);

}
