package com.patita.oriental.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.patita.oriental.app.model.Role;
import com.patita.oriental.app.reposity.RoleRepository;

@Component
public class RoleDataLoader implements CommandLineRunner {
	@Autowired
	RoleRepository roleRepository;

	@Override
	public void run(String... args) throws Exception {
		if (roleRepository.count() == 0) {
			roleRepository.save(new Role(null, "Admin"));
			roleRepository.save(new Role(null, "Customer"));
		}
		
	}

}
