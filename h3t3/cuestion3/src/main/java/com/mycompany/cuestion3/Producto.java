/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuestion3;

import javax.swing.JTextField;

/**
 *
 * @author Campus FP
 */
public class Producto 
{
    private int id;
    private String nombre;
    private int unidades;
    private float precio;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public float getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    void setId(JTextField txtID) {
        throw new UnsupportedOperationException("No admitido."); 
    }

}
