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

  public void senoX() {
    System.out.println("Ingrese el angulo X:");  
    double x=objTec.nextInt();
    System.out.println("Ingrese el limite de la funcion:");  
    int fxl=objTec.nextInt();    
    double resultadoFx=0; 
    int contador=0;
    for (int i = 1; i < fxl; i+=2) {
      if(contador%2==0){
        resultadoFx=resultadoFx+(potencia(x,i)/factorial(i));
      }else{
        resultadoFx=resultadoFx-(potencia(x,i)/factorial(i));
      }
      System.out.println("f(x)="+resultadoFx);
      contador++;
      } 
      
    System.out.println("El seno("+x+")="+resultadoFx);
  }


  public void funcionExponencial() {
    System.out.println("Ingrese un numero X:");  
    double x=objTec.nextInt();
    System.out.println("Ingrese el limite de la funcion:");  
    int fxl=objTec.nextInt();    
    double resultadoFx=0;
    for (int fl = 0; fl < fxl; fl++) {
        resultadoFx=resultadoFx+(potencia(x,fl)/factorial(fl));
        //System.out.println("y="+resultadoFx);
    }
    System.out.println("La fun exponcial es :"+resultadoFx);
  }

  public void matIntCompuesto() {
    System.out.println("Ingrese el Capital:");  
    double P=objTec.nextDouble();   
    System.out.println("Ingrese el Periodo en Anhos:");  
    int periodo=objTec.nextInt();    
    double capitalfinal=0;
    for (int n = 1; n <= periodo; n++) {
      capitalfinal+=Math.round(P*potencia((1+0.15),n));  
    }
    System.out.println("El capital final al cabo de "+periodo+" anhos es:"+capitalfinal);        
  }


    
}
