package com.portfolio.CF.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Debe contener entre 1 y 50 caracteres")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Debe contener entre 1 y 50 caracteres")
    private String apellido;
    
    @Size(min = 1, max = 50, message = "Debe contener entre 1 y 50 caracteres")
    private String img;
    
    
}
