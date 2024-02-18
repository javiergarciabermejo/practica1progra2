package mates;

import java.util.Random;

public class Matematicas {
   

    public static double generarNumeroPiIterativo(long pasos) {
        
        Random rand = new Random();
        long dentroCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = rand.nextDouble();  
            double y = rand.nextDouble();  

     
            if (x * x + y * y <= 1) {
                dentroCirculo++;
            }
        }

        return 4.0 * dentroCirculo / pasos;
    }
}
