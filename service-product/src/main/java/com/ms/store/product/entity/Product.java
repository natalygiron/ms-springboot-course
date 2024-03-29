package com.ms.store.product.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

@Entity
@Table(name = "tbl_products")
@AllArgsConstructor //Constructor con todas las propiedades
@NoArgsConstructor @Data
@Builder // Permitirá hacer nuevas instancias de la entidad
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El campo nombre no debe ser vacío")
    private String name;
    private String description;
    @Positive(message = "El stock debe ser mayor a cero.")
    private Double stock;
    private Double price;
    private String status;

    @Column(name="create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @NotNull(message = "Debe insertar una categoría")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Category category;

}
