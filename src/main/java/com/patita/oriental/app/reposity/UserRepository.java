package com.patita.oriental.app.reposity;

import org.springframework.data.repository.CrudRepository;

import com.patita.oriental.app.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
