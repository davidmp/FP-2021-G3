package pe.edu.upeu;

import java.util.Scanner;

public class SubProgramas {
  Scanner objTec=new Scanner(System.in);//objeto



  public int factorial(int numero) {
    int resultado=1;
    if(numero>1){
        for (int i = 1; i <= numero; i++) {
            resultado=resultado*i;
        }
    }
     return resultado;
  }


  public void funcionExponencial() {
    System.out.println("Ingrese un numero:");  
    int valor=objTec.nextInt();
    int resultado=factorial(valor);
    System.out.println("El factorial de:"+valor+" es:"+resultado);
  }


    
}
