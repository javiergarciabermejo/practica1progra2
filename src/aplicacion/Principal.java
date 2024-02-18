package aplicacion;
import operaciones.*;


public class Principal{

    
    public static void main(String[] args){



        System.out.println("1) La suma de los 10 primeros números naturaleses: "+ Operaciones.sumaMemoria(0, 0, 0));
        System.out.println("1.2) la suma de los 10 priemeros números naturaleses:" + Operaciones.sumaVersion2(0));
    
    }
}