package vectores;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {

        System.out.println("Insert a name!");
        String vector[] = new String[8];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            vector[i] = teclado.next();
            System.out.println("Insert a name!");

        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("In the position number: " + (i + 1) + " it is the name of: " + vector[i]);

        }

    }
}
