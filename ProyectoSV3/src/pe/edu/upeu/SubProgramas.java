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

  public double potencia(double base, int exponente) {
      double resultado=Math.pow(base, exponente);
    return resultado;
  }

  public void funcionExponencial() {
    System.out.println("Ingrese un numero X:");  
    double x=objTec.nextInt();
    System.out.println("Ingrese el limite de la funcion:");  
    int fxl=objTec.nextInt();    
    double resultadoFx=0;
    for (int fl = 0; fl < fxl; fl++) {
        resultadoFx=resultadoFx+(potencia(x,fl)/factorial(fl));
        System.out.println("y="+resultadoFx);
    }
    System.out.println("La fun exponcial es :"+resultadoFx);

  }


    
}
