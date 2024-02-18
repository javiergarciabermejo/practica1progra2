package operaciones;


public class Operaciones{
    public static int suma(int n)
    {
        if(n==0)
        {
            return 0;

        }
        else{
            return n + suma(n+1);
        }


    }


    public static int sumaMemoria(int n,int i,int acumulado){
        if(i>n)
        {
            return acumulado;
        }
        else{
            return sumaMemoria(n, i+1, acumulado+i);
        }
    }



    public static int sumaVersion2(int n){
        return n;

    }

}