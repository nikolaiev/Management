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
@Table(name = "sprints")
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private long sId;

    @Column(name = "pid")
    private long pId;

    @Column(name = "ord_numb")
    private long ordNumb;

    @Column(name = "title")
    private String title;
}
