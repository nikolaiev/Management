package com.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by vlad on 30.01.17.
 */
@Entity
@Table(name="companies")
@Data
@NoArgsConstructor
public class Company implements Serializable {
    @Id
    @Column(name="com_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long comId;

    @Column(name="title")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String title;

    @Column(name="info")
    private String info;
}
