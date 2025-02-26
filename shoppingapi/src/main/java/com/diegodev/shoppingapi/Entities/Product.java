package com.diegodev.shoppingapi.Entities;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="products")
@Getter
@Setter
@AllArgsConstructor()
@NoArgsConstructor()
public class Product {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    
    @NotNull(message = "esse campo não pode ser vazio")
    @Min(message = "mínimo é 10 caracteres",value = 10)
    @Max(message = "máximo 50 caracteres",value = 50)
    String name;

    @NotNull(message = "esse campo não pode ser vazio")
    @Min(message = "mínimo é 10 caracteres",value = 10)
    @Max(message = "máximo 500 caracteres",value = 500)
    String about;
    @NotNull(message = "esse campo não pode ser vazio")
    @Min(message = "mínimo é 2 anos",value = 2)
    @Max(message = "máximo 30 caracteres",value = 30)
    String category;
    @NotNull(message = "esse campo não pode ser vazio")
    @Min(message = "mínimo  4 caracteres",value = 4)
    @Max(message = "máximo 30 caracteres",value = 30)
    String state;
    @Column(name = "price", precision = 10, scale = 2) 
    private BigDecimal price;
    String cover;
    String imgs;
    @NotNull(message = "esse campo não pode ser vazio")
    @Min(message = "mínimo  4 caracteres",value = 4)
    @Max(message = "máximo 30 caracteres",value = 30)
    String mark;
    @Min(message = "mínimo  4 caracteres",value = 4)
    @Max(message = "máximo 30 caracteres",value = 30)
    @NotNull(message = "esse campo não pode ser vazio")
    String model;
   @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;





}
