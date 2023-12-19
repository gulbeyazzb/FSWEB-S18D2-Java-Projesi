package com.workintech.day2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Data
@Entity
@Table(name = "vegetable",schema ="fsweb")
public class Vegetable {

    @Column(name = "is_grown_tree")
    private boolean isGrownOnTree;
}
