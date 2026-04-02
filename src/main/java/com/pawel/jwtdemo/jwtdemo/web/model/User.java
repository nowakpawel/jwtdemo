package com.pawel.jwtdemo.jwtdemo.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id, String userName, String email, String password) {
}
