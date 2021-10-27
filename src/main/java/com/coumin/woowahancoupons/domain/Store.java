package com.coumin.woowahancoupons.domain;

import lombok.*;
import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="stores")
@Entity
public class Store extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Long id;

    @Column(length = 100, nullable = false, name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;
}