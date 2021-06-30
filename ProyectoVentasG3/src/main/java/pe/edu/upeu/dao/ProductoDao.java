package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ProductoDao extends AppCrud{
    LeerArchivo lar;
    
    CategoriaTO catTO;
    ProductoTO proTO;

    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();

    public void registrarProducto() {
        proTO=new ProductoTO();
        mostrarCategorias();
        proTO.setIdCateg(lte.leer("", "Ingrese el Id de Categoria:"));
        proTO.setNombre(lte.leer("", "Ingrese nombre producto:"));
        lar=new LeerArchivo("Producto.txt");
        proTO.setIdProducto(generarId(lar, 0, "P", 1));
        proTO.setUnidaMed(lte.leer("", "Ingrese Undad de medida:"));
        proTO.setPrecioUnit(lte.leer(0.0, "Ingrese P. Unitario:"));
        proTO.setPorcentUtil(lte.leer(0.0, "Ingrese P. Utilidad:"));
        proTO.setStock(lte.leer(0.0, "Ingrese el Stock:"));
        lar=new LeerArchivo("Producto.txt");
        agregarContenido(lar, proTO);
    }

    public void mostrarCategorias() {
        lar=new LeerArchivo("Categoria.txt");
        Object[][] datax=listarContenido(lar);
        for (int i = 0; i < datax.length; i++) {
            System.out.print(datax[i][0]+"="+datax[i][1]+",");
        }
        System.out.println("");
    }

    public void reporteProductos() {
        lar=new LeerArchivo("Producto.txt");
        imprimirLista(listarContenido(lar));
    }
        
}
