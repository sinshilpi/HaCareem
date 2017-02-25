package com.aman.hack.repository;

import com.aman.hack.model.OrderTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderTableRepository extends JpaRepository<OrderTable, Long> {

}
