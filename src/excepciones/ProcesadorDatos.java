package excepciones;

import java.util.Scanner;

public class ProcesadorDatos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] valores = {"15", "20", "0", null, "Hola", "50", ""};
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Modificar valor");
            System.out.println("2. Mostrar longitud de cadena");
            System.out.println("3. Calcular división");
            System.out.println("4. Extraer primera letra");
            System.out.println("5. Salir");
            System.out.println("Introduce una opcion: ");
            opcion = teclado.nextInt();
            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Selecciona una posicion (0-6): ");
                        int posicion = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Que valor quieres poner?");
                        valores[posicion] = teclado.nextLine();
                    }
                    case 2 -> {
                        System.out.println("Selecciona una posicion (0-6): ");
                        int posicion = teclado.nextInt();
                        System.out.println("La longitud de la cadena es de " + valores[posicion].length());
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posicion fuera del array");
            } catch (NullPointerException e) {
                System.out.println("Longitud de la cade vacía(null)");
            }
        } while (opcion != 5);
    }
}
