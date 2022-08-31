package com.example.payment.gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.payment.gateway.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	Order findByRazorpayOrderId(String orderId);
}