package com.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vlad on 30.01.17.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid")
    private long pId;

    @Column(name = "cus_id")
    private long cusId;

    @Column(name = "bdate")
    private Date bDate;

    @Column(name = "edate")
    private Date eDate;

    @Column(name = "manag_id")
    private int managId;
}
