package otroejercicio;

import java.io.*;

public class MainBinario {
    public static void main(String[] args) {
        // Creamos un array de enteros.
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        FileOutputStream fstream;
        DataOutputStream outputFile;
        try{
            // Abrimos el archivo binario para posteriormete dar salida.
            fstream = new FileOutputStream("Numeros.dat");
            outputFile = new DataOutputStream(fstream);
            System.out.println("Escribiendo archivo...");
            // Escribimos el arreglo de numeros en el archivo binario.
            for (int i = 0; i < numbers.length; i++)
                outputFile.writeInt(numbers[i]);
            // Cerramos el archivo.
            outputFile.close();
            System.out.println("Finalizado.");
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
