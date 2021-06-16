package pe.edu.upeu.app;

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

    
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        LeerTeclado lt=new LeerTeclado();

        CategoriaTO categx=new CategoriaTO();        
        categx.setIdCateg(lt.leer("", "Ingrese Id categoria: "));
        categx.setNombre(lt.leer("", "Ingrese nombre:"));
        registrarCategoria(categx);


        ProductoTO prodx=new ProductoTO();        
        prodx.setIdCateg(lt.leer("", "Ingrese Id Producto: "));
        prodx.setNombre(lt.leer("", "Ingrese nombre:"));
        registrarProducto(prodx);        

        new MainGUI();
    }
}
