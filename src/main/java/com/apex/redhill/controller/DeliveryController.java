package com.apex.redhill.controller;

import com.apex.redhill.entity.DeliverySchedule;
import com.apex.redhill.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    DeliveryRepository deliveryRepository;

    @GetMapping ("/{beneficiaryID}")
    public Optional<DeliverySchedule> getDelivery(@PathVariable("beneficiaryID") int beneficiaryID) {
        Optional<DeliverySchedule> deliverySchedule = deliveryRepository.findById(beneficiaryID);
        return deliverySchedule;
    }

    @PostMapping("/update")
    public boolean updateDelivery(@RequestBody DeliverySchedule deliverySchedule) {
        deliveryRepository.save(deliverySchedule);
        return true;
    }
}
