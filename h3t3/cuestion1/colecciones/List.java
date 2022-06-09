package h3t3.cuestion1.colecciones;


import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
                //Crear la lista
                java.util.List<String> list=new ArrayList<String>();

                //AAñadir elementos a la lista
                list.add("Carlos");
                list.add("Rodrigo");
                list.add("María");

                //Iterar la lista usando un for-each
                for(String persona:list)
                    System.out.println(persona);
    }
}
