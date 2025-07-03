package com.patita.oriental.app.reposity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.patita.oriental.app.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByIsActive(boolean isActive);
}
