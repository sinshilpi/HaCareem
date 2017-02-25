package com.aman.hack.repository;

import com.aman.hack.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aman.singhal on 2/25/17.
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
