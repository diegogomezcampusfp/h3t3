package h3t3.cuestion1.colecciones;

import java.util.Enumeration;
import java.util.Hashtable;

public class Tabla {
    public static void main(String[] args) {
        //Creamos la tabla
        Hashtable tabla=new Hashtable();

        //Añadimos elementos a la tabla
        tabla.put("1", "Primero");
        tabla.put("2", "Segundo");
        tabla.put("3", "Tercero");
        tabla.put("4", "Cuarto");

        //Recorrer claves
        Enumeration keys = tabla.keys();
        while (keys.hasMoreElements())
        {
            System.out.println(keys.nextElement());
        }

        //Recorrer valores
        Enumeration valores = tabla.elements();
        while (valores.hasMoreElements())
        {
            System.out.println(valores.nextElement());
        }


    }


}
