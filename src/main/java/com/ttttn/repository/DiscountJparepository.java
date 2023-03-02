package com.ttttn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ttttn.entity.Discount;

@Repository
public interface DiscountJparepository extends JpaRepository<Discount, Integer>{

}
