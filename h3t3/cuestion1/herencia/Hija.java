package h3t3.cuestion1.herencia;

//Extends ya que es una clase heredada
public class Hija extends Padre{
    public Hija(String nombre, int edad) {
        super(nombre, edad);

    }
    //Sobrescribir método de la clase que heredamos
    public void Hablar() {
        System.out.println("Esta hablando la hija");
    }
}
