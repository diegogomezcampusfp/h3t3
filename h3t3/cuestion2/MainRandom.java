package h3t3.cuestion2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainRandom {
    public static void main(String[] args) throws Exception {
        //Creo un arraylist de tipo String
        List<String> lista = new ArrayList<String>();

        //Instancio BufferedReader y lo uso jutno a FileReades para leer mi archivo.txt
        BufferedReader r = new BufferedReader(new FileReader("src/h3t3/cuestion2/archivo.txt"));

        //Hafo un for para añadir cada linea que esté en mi archivo.txt
        for (String texto = r.readLine(); texto != null; texto = r.readLine()) {
            lista.add(texto);/*w  w w  .j av a 2s.c om*/
        }
        r.close();
        //Instancio Scanner para poder introducir las respuestas
        Scanner sc = new Scanner(System.in);

        //Instancio random para poder sacar las preguntas de forma aleatoria
        Random random = new Random();

        //Recorro mi archivo de 10 preguntas con un for
        for (int i = 0; i < 10; i++) {
            System.out.println( lista.get(random.nextInt(lista.size() - 1)));
            String resp = sc.nextLine();
        }
        sc.close();
        System.out.println("Has terminado");
    }

}