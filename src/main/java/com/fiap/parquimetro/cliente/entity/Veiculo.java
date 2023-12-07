package com.fiap.parquimetro.cliente.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "veiculo")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Veiculo {
   @Id
   @Column(unique = true)
   private String placa;

   @Column(nullable = false)
   private String cor;

   @ManyToOne
   private Modelo modelo;

   @Column(nullable = false)
   private Condutor condutor;
    
}