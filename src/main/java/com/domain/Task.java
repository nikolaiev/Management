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
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tid")
    private long tId;

    @Column(name = "sid")
    private long sId;

    @Column(name = "title")
    private String title;

    @Column(name = "estimate")
    private long estimate;


}
