package com.appdhome.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="state")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class State implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "statename", nullable = false, length = 50)
    private String name;
}
