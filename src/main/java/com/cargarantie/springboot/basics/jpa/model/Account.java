package com.cargarantie.springboot.basics.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Account")
@Data
@NoArgsConstructor
public class Account {

  @Id
  @GeneratedValue
  private Long id;
  private String accountNumber;
  private String balance;
  private String bank;
  private String owner;
}
