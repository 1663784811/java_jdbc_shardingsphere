package com.example.entity.order;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Table(name = "t_order")
@Data
@Entity
public class Order {
    @Id
    @Column(name = "id", columnDefinition = "int not null COMMENT 'id'")
    private Long id;
    private String orderNumber;
    private BigDecimal amount;
}