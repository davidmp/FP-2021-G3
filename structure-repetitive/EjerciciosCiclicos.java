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
            numeros = numAleatorio.nextInt(10)-4;
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

    public static void pagoHamburgesas() {
        //Daclarar Variables
        String tipoPago;
        int cantidad;
        double totalPago=0;
        int contador=1;
        //proceso y datos de Entrada
        while (contador<=3){
            if (contador==1) {
                System.out.println("Ingrese la cantidad de hamburgesas simples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*20;
            }
            if (contador==2) {
                System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*25;
            }
            if (contador==3) {
                System.out.println("Ingrese la cantidad de hamburgesas Triples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*28;
            }  
            contador++;                  
        }
        //datos de salida, entrada
        System.out.println("Ingrese la forma de pago (Con tarjeta=CT, Sin tarjeta=ST):");
        tipoPago=teclado.next();
        if (tipoPago.toUpperCase().equals("CT")) {
            totalPago=totalPago+totalPago*0.05;
        } 
        System.out.println("El monto total a pagar es:"+totalPago);
    }


    public static void main(String[] args) {
        //contarNumerosNegPosCero();
        pagoHamburgesas();
    }
}
