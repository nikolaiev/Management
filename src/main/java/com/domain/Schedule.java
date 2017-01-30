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
@Table
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sc_id")
    private long scId;

    //employee id
    @Column(name = "emp_id")
    private long empId;

    //task id
    @Column(name = "tid")
    private long tId;

    //project id
    @Column(name = "pid")
    private long pId;

    //flag is done
    @Column(name = "is_done")
    private boolean isDone;
}
