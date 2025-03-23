package fr.studi.stock.pojo;

import lombok.Data;

@Data
public class Produit {
    private Long produit_Id;
    private String nom;
    private String description;
    private Float prix;
    private Integer quantite;
}
