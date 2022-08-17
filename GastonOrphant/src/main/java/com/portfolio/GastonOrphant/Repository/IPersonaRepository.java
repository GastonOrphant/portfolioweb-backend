
package com.portfolio.GastonOrphant.Repository;

import com.portfolio.GastonOrphant.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
