package pe.edu.upeu.app;

import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.gui.*;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerTeclado;
/**
 * Hello world!
 *
 */
public class App {

    public static void registrarCategoria(CategoriaTO categ) {
        System.out.println("--------Registro Categoria----------");
        System.out.println("IdCategoria: "+categ.getIdCateg()+" \tnombre: "+categ.getNombre());
    }
    
    public static void registrarProducto(ProductoTO prod) {
        System.out.println("--------Registro Producto----------");
        System.out.println("IdCategoria: "+prod.getIdCateg()+" \tnombre: "+prod.getNombre());
    }    

    public static void menuMain() {
        int opcionAlg=0;
        String mensaje="Seleccione el algortimo que desea probar:"+
        "\n1=Registro Categoria"+
        "\n12=Reporte Categoria"+
        "\n2=Registro Producto"+
        "\n3=Registro Usuario"+
        "\n4=Registro de Ventas"+
        "\n5=Reportes"+
        "\n0=Salir del Programa"
        ;
        CategoriaDao daoCat;
        System.out.println(mensaje);
        LeerTeclado lt=new LeerTeclado();
        opcionAlg=lt.leer(0, mensaje);
        do {                        
            switch (opcionAlg) {
                case 1: daoCat=new CategoriaDao(); daoCat.registrarCategoria(); break;
                case 12: daoCat=new CategoriaDao(); daoCat.reportarCategoria(); break;
                case 2:break;
                case 3:break;
                case 4:;break;
                case 5:break;
                default: System.out.println("Opcion no existe!"); break;    
            } 
            System.out.println("Desea seguir probando algoritmos?:"+mensaje);           
            opcionAlg=lt.leer(0, mensaje);
        } while (opcionAlg!=0);        
    }    
    public static void main( String[] args ){
        menuMain();
    }
}
