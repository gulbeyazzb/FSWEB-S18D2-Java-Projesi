package com.workintech.day2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

@NoArgsConstructor
@Data
@Entity
@Table(name = "fruit",schema = "fsweb")
public class Fruit {
   @Enumerated(EnumType.STRING)
   @Column(name = "fruit_type")
    private FruitType fruitType;
}
