package com.patita.oriental.app.reposity;

import org.springframework.data.repository.CrudRepository;

import com.patita.oriental.app.model.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {

}
