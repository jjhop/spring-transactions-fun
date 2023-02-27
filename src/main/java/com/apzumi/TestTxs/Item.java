package com.apzumi.TestTxs;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "items")
public class Item {
    @Id
    @SequenceGenerator(name = "items_seq", sequenceName = "items_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "items_seq")
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    public Item(String description) {
        this.description = description;
    }
}
