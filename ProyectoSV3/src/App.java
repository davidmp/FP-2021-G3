import pe.edu.upeu.SubProgramas;
import pe.edu.upeu.recur.EjemplosRecursivos;
import pe.edu.upeu.util.Teclado;

public class App {

    public static void main(String[] args) throws Exception {
       /* SubProgramas obj=new SubProgramas();///obj es un objeto
        //obj.funcionExponencial();

        obj.matIntCompuesto();
        System.out.println("Holasss");*/

        Teclado tc=new Teclado();

        EjemplosRecursivos objER=new EjemplosRecursivos();

        int numero=tc.leer(0, "Ingrese un numero:");
        System.out.println("Facorial iterativo:"+objER.factorial(numero));
        System.out.println("Facorial Recursivo:"+objER.factorialRecur(numero));
    }
}
