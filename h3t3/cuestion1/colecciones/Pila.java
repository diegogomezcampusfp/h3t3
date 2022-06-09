package h3t3.cuestion1.colecciones;

import java.util.Stack;

public class Pila {
    public static void main(String[] args) {

        //Creamos la pila de tipo entero
        Stack<Integer> pila= new Stack<>();


        // Metemos objetos en la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        // Variables para el estado y primera posición de la pila
        boolean estado = pila.empty();
        int pos = pila.peek();

        //Mostramos objetos y posición de la lista
        System.out.println("Elementos de la lista " + pila);
        estado = pila.empty();
        System.out.println("Estado de la pila " + estado);
        System.out.println("La primera posición es: "+pos);
    }
}
