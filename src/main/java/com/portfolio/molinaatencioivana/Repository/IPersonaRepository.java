package com.portfolio.molinaatencioivana.Repository;

import com.portfolio.molinaatencioivana.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
