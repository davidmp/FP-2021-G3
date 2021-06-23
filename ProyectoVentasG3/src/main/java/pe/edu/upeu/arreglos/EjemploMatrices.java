package pe.edu.upeu.arreglos;

public class EjemploMatrices {
    

    public void conceptoMatrices() {
       //definir una matriz con valores/elementos predefinidos
       int[][] matriz={
           {5,	6,	6},
           {5,	6,	2},
           {5,	12,	2},
           {5,	6,	2}
       }; 
       //obtener la dimension en filas
       System.out.println("dimension en Fila:"+matriz.length);
       //obtener la dimension en columnas
       System.out.println("dimension en columna:"+matriz[0].length);
       //definir matriz sin valores
       int[][] matrix;
       //deinir tamanho a una matriz
       matrix=new int[3][3];
       //colocar lavores en una posicion de matriz
       matrix[1][2]=14;
       //imprimiendo valores/elementos de una matriz
       System.out.println("el valor de la posion (1,2) es:"+matrix[1][2]);

    }
    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        EjemploMatrices emx=new EjemploMatrices();
        emx.conceptoMatrices();

        int[][] matriz={
            {5,	6,	6},
            {5,	6,	2},
            {5,	12,	2},
            {5,	6,	2}
        };
        emx.imprimirMatriz(matriz);
    }

}
