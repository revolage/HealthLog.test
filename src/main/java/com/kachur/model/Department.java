package com.kachur.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="department")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

//    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
//    private Set<Doctor> doctors = new HashSet<Doctor>();
    //Doctor doctor;
}
