package com.apex.redhill.repository;

import com.apex.redhill.entity.DeliverySchedule;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryRepository extends CrudRepository<DeliverySchedule, Integer> {
}
