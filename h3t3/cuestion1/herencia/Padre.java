package h3t3.cuestion1.herencia;

//Información clase Padre (si fuera abstracta, no podríamos instanciarla).
public  class Padre {
    String nombre;
    int edad;
    String despedida;

//Constructor del padre
    public Padre(String nombre, int edad) {
        nombre = nombre;
        edad = edad;

    }

    //Método Hablar
    public void Hablar() {
        System.out.println("Está hablando el Padre");
    }

    public void Datos(String nombre) {
        System.out.println("Los datos del padre son: "+nombre);
    }

    public void Datos(String nombre, int edad) {
        System.out.println("Los datos del padre son: "+nombre+edad);
    }
}
