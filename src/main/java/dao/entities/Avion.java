package dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Avion {
    @Id
    @GeneratedValue
    private Long id;
    private String model;
    private String color;
    private String matricule;
    private double price;


}
