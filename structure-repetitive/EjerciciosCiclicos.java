import java.util.Random;
import java.util.Scanner;

public class EjerciciosCiclicos {
  
    static Scanner teclado=new Scanner(System.in);

    public static void contarNumerosNegPosCero() {
        //Daclarar Variables
        int nNumeros, cantCero=0, cantNeg=0, cantPost=0;
        double numeros;
        int numInit=0, numFinal=0;
        //datos de Entrada
        System.out.println("Ingrese N cantidad:");
        nNumeros=teclado.nextInt();
        Random numAleatorio = new Random();
        //Proceso
        for (int numero=1; numero<=nNumeros; numero++) {
            /*System.out.print("Ingrese el valor de la posicion "+numero+":");*/
            /*numeros=teclado.nextDouble();*/
            numeros = numAleatorio.nextInt(20-10)-4;
            System.out.println(numeros);
            if (numeros<0) {cantNeg++;} 
            if (numeros>0) {cantPost=cantPost+1;} 
            if (numeros==0) {cantCero+=1;}             
        }
        //datos de salida
        System.out.println("De total de numeros:\n"+cantCero+" es/son cero(s)"+
        "\n"+cantNeg+" es/son menor(es) de cero"+
        "\n"+cantPost+" es/son mayor(es) de cero"
        );
    }

    public static void main(String[] args) {
        contarNumerosNegPosCero();
    }
}
