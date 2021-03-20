package com.example.CodeWeb.repo;

import com.example.CodeWeb.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
