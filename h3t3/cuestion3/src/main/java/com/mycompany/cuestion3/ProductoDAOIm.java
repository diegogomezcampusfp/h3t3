/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuestion3;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Campus FP
 */
public class ProductoDAOIm
{
    
        Connection con;
	PreparedStatement ps;
	String sql;
	
	public void añadir(Producto producto)
        {
		
		 try 
                 {
		    con =  ProductoDb.getConnection();
	            sql = "INSERT INTO producto(nombre,unidades,precio, disponible) VALUES (?,?,?, true)";
	            ps = con.prepareStatement(sql);
	            ps.setString(1, producto.getNombre());
	            ps.setInt(2, producto.getUnidades());
	            ps.setFloat(3, producto.getPrecio());
	            ps.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Producto añadido");
	        } catch (Exception e)
                {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(null, "No se ha añadido el producto");
	        }

	}


	public void actualizar(Producto producto)
        {
	   try 
             {  
             Connection con = ProductoDb.getConnection();
             String sql = "UPDATE producto SET nombre=?,unidades=?,precio=? WHERE idProducto=?";
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, producto.getNombre());
	     ps.setInt(2, producto.getUnidades());
	     ps.setFloat(3, producto.getPrecio());
             ps.setInt(4, producto.getId());
             ps.executeUpdate();

        
            JOptionPane.showMessageDialog(null, "Producto actualizado");
        } catch (Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se ha actualizado");
        }
		
		
	}

	
	public void eliminar(Producto producto) {
		 try
                 {
	           
	            Connection con = ProductoDb.getConnection();
	            String sql = "delete from producto  WHERE idProducto=?";
	            PreparedStatement ps = con.prepareStatement(sql);  
	            ps.setInt(1, producto.getId());
	            ps.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Producto eliminado");
	        } catch (Exception e)
                {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(null, "No se ha podido eliminar");
	        }
		
	}


	public Producto buscar(int id)
        {
		
		 Producto st = new Producto();
	        try
                {
	            Connection con = ProductoDb.getConnection();
	            String sql = "SELECT * FROM producto WHERE idProducto=?";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setInt(1, id);
	            ResultSet rs = ps.executeQuery();
	            if(rs.next())
                    {
	                
	                 st.setId(rs.getInt("idProducto"));
	                st.setNombre(rs.getString("nombre"));
	                st.setUnidades(rs.getInt("unidades"));
	                st.setPrecio(rs.getFloat("precio"));

	            }
	            
	        } catch (Exception e)
                {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(null, "No se encontró el producto");
	        }
	        return st;
	}

	
	public List<Producto> mostrar() 
        {	
            List<Producto> list = new ArrayList<Producto>();
        try
        {
            Connection con = ProductoDb.getConnection();
            String sql = "SELECT * FROM producto ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
            	Producto st = new Producto();
                st.setId(rs.getInt("idProducto"));
                st.setNombre(rs.getString("nombre"));
	        st.setUnidades(rs.getInt("unidades"));
	        st.setPrecio(rs.getFloat("precio"));
                list.add(st);
            } 
        }
        catch (Exception e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión");
        }
        return list;
	}

    Producto get(JTextField txtID) {
        throw new UnsupportedOperationException("No admitido."); 
    }

}
