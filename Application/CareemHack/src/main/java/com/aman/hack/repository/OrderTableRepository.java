package com.aman.hack.repository;

import com.aman.hack.model.OrderTable;
import com.aman.hack.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface OrderTableRepository extends JpaRepository<OrderTable, Long> {


//    List<Item> findItems(long orderid);

}
