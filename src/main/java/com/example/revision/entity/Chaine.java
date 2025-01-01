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
public class Chaine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long chld;
    String chNom;
    @Enumerated(EnumType.STRING)
    Thematique chTheme;
    @OneToMany(mappedBy = "chaine")
    List<Programme> programmes;

}
