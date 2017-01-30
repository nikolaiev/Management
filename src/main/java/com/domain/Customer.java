package com.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by vlad on 30.01.17.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name="customers")
public class Customer {
    @Id
    @Column(name = "cus_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cusId;

    @Column(name = "com_id")
    private long comId;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;
}
