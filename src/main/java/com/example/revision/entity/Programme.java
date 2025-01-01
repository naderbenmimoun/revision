package com.example.revision.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Programme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long prld;
    String prNom;
    @ManyToMany(mappedBy = "prgrammes")
    List<Utilisateur> utilisateurs;
    @ManyToOne
    Chaine chaine;






}
