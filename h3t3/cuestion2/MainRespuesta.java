package h3t3.cuestion2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class MainRespuesta {
    public static void main(String[] args) {
        //Creo las respuestas a mis preguntas
        String resp1 = "20";
        String resp2 = "Diego";
        String resp3 = "CampusFP";
        String resp4 = "Java";
        String resp5 = "7";
        String resp6 = "10";
        String resp7 = "Real Madrid";
        String resp8 = "18";
        String resp9 = "Si";
        String resp10 = "10";


        //Creo mi BufferedReader para ir pasando por todas las preguntas
        BufferedReader reader;

        //Instancio mi scanner para poder escribir las respuestas
        Scanner sc = new Scanner(System.in);

        //Utilizo un try para poder leer con FileReader mi archivo
        try
        {
            reader = new BufferedReader(new FileReader("src/h3t3/cuestion2/archivo.txt"));
            String line = reader.readLine();

            //Recorro mi archivo con un while
                while (line != null)
                {
                    System.out.println(line);
                    line = reader.readLine();
                    String resp = sc.nextLine();
                }
                reader.close();
            System.out.println("Has terminado");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
