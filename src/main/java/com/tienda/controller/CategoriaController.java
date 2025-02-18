/*Controlador de la categoria*/
package com.tienda.controller;

import com.tienda.service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j /*Clase de lombok para hacer lógica*/
@RequestMapping("/categoria") /*Mapeado a esa carpeta*/
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado") /*Indicar que al ingresar a listado, lo ejecute*/
    public String inicio(Model model)
    {
        var categorias = categoriaService.getCategorias(false);
        
        /*Llenan la información de la tabla y del cuadro*/
        model.addAttribute("categorias", categorias); /*Preparando la información para mandarla al html*/
        model.addAttribute("totalCategorias", categorias.size()); /*Manda la cantidad que hay en categoria*/
        
        return "/categoria/listado"; /*Después de mandarlo, regresa a esa vista*/
    }
}