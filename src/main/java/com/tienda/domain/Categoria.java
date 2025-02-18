/*Representación de la tabla de la BD*/
package com.tienda.domain;

import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;

/*Lo que representa*/
@Data
@Entity
@Table(name="categoria")

public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    /*Indicar a que corresponde a esa columna en la BD porque cambio de nombre*/
    @Column(name="id_categoria")
    private long idCategoria;
    
    private String descripcion;
    @Column(name="ruta_imagen")
    private String rutaImagen;
    private boolean activo;
    
    public Categoria()
    {
        
    }
    
    public Categoria(String descripcion, boolean activo)
    {
        this.descripcion = descripcion;
        this.activo = activo;
    }
}