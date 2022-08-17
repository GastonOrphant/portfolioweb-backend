
package com.portfolio.GastonOrphant.Interface;

import com.portfolio.GastonOrphant.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // obtener lista de personas
    public List<Persona> getPersona();
    
    // guardar objeto de tipo persona
    public void savePersona(Persona persona);
    
    // eliminar una persona por ID
    public void deletePersona(Long id);
    
    // buscar una persona por ID
    public Persona findPersona(Long id);
}
