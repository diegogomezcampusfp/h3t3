/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.cuestion3;

import java.util.List;

/**
 *
 * @author Campus FP
 */
public interface ProductoDAO 
{
    public void save(Producto producto);
    public void update(Producto producto);
    public void delete(Producto producto);
    public Producto get(int id);
    public List<Producto> list();
}
