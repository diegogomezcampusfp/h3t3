package h3t3.cuestion1.colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    public static void main(String[] args) {
        //Creamos la cola de tipo entero
        Queue<Integer> nums = new LinkedList<>();

        //Creamos elementos para la cola
        nums.offer(1);
        nums.offer(2);
        nums.offer(3);
        nums.offer(4);
        nums.offer(5);
        //Mostramos sus elementos
        System.out.println("Cola: " + nums);

        //Eliminar elementos de la cola
        int delete = nums.poll();
        System.out.println("Elemento eliminado: " + delete);

        //Actualizamos estado de la cola
        System.out.println("Cola actualizada: " + nums);
    }
    }

