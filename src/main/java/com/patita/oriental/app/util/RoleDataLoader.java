package com.patita.oriental.app.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.patita.oriental.app.model.Role;
import com.patita.oriental.app.reposity.RoleRepository;

@Component
@Order(2)
public class RoleDataLoader implements CommandLineRunner {

	@Autowired 
	RoleRepository roleRepository;
	
	@Override
	public void run(String... args) throws Exception {
		if (roleRepository.count() == 0) {
            Role admin = new Role(null, "ADMIN");
            Role customer = new Role(null, "CUSTOMER");

            roleRepository.saveAll(List.of(admin, customer));
            System.out.println("Roles insertados correctamente.");
        } else {
            System.out.println("Ya existen roles en la base de datos. No se insertaron duplicados.");
        }
		
	}

}
