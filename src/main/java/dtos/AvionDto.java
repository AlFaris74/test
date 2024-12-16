package dtos;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AvionDto {
    private String model;
    private String color;
    private String matricule;
    private double price;
}
