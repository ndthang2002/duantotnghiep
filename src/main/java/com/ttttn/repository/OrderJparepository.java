package com.ttttn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ttttn.entity.Order;

@Repository
public interface OrderJparepository  extends JpaRepository<Order, Integer>{

}
