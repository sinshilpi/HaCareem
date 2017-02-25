package com.aman.hack.repository;

import com.aman.hack.model.Hub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HubRepository extends JpaRepository<Hub, Long> {

}
