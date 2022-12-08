package otroejercicio;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class MainBinarioLeer {

    public static void main(String[] args)  {

        int numero; // Almacenamos el elementos

        boolean finDeArchivo = false; // Indicador de fin de archivo

        // Abrimos el archivo como archivo binario.

        FileInputStream fstream;

        DataInputStream inputFile;

        try{
            fstream = new FileInputStream("Numeros.dat");
            inputFile =  new DataInputStream(fstream);
            System.out.println("Leyendo documento:");
            // Leemos la información contenida en el archivo.
        System.out.println("Leyendo documento:");
        // Leemos la información contenida en el archivo.
        while (!finDeArchivo) {
            try {
                numero = inputFile.readInt();
                System.out.print(numero + " ");
            } catch (EOFException e) {
                System.out.println("Fin de archivo: " + e.getMessage());
                finDeArchivo= true;
            }
        }

        // Cerramos el archivo.
        inputFile.close();
        System.out.println("\nFinalizado.");

        }catch (IOException ex){
            System.out.println("Ha ocurrido un error: "+ ex.getMessage());
        }

    }
}
