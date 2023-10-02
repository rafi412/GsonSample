package PersonaGson;

import PersonaGson.Persona;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recoger datos desde la consola
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce los apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Introduce la edad: ");
        int edad =scanner.nextInt();

        // Crear una instancia de la clase Persona con los datos recogidos
        Persona p = new Persona(nombre, apellidos, edad);

        // Convertir el objeto Persona a JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(p);

        // Mostrar el resultado en la consola
        System.out.println("Datos en formato JSON:");
        System.out.println(json);
        scanner.close();
    }
}