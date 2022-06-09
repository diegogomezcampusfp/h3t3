package h3t3.cuestion1.herencia;

public class Main {
    public static void main(String[] args) {

        //Instanciar
        Padre padre = new Padre("Jose",74);
        Hijo hijo = new Hijo("Pepe",30);
        Hija hija = new Hija("Sara",32);

        //LLamar a los métodos
        padre.Hablar();
        hija.Hablar();
        hijo.Hablar();


    }
}
