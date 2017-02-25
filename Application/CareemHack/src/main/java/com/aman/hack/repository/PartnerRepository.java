package com.aman.hack.repository;

import com.aman.hack.model.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {

}
