package com.sayan.SPRINGJPA.Entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.id.factory.IdentifierGeneratorFactory;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
}
