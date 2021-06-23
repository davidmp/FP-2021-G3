package pe.edu.upeu.arreglos;

public class Transformadas {
 
    public void contarCerosPostNegMatriz() {
        int cantNeg=0, cantPost=0, cantCeros=0;
        int[][] matrizT={
            {5,	6,	0},
            {5,	-6,	2},
            {0,	12,	-2},
            {0,	6,	2}
        };
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                if (matrizT[i][j]<0) {
                    cantNeg++;
                }else if(matrizT[i][j]==0){
                    cantCeros++;
                }else{
                    cantPost++;
                }
            }
        }  
        System.out.println("Cantidad ceros:"+cantCeros);      
        System.out.println("Cantidad positivos:"+cantPost);      
        System.out.println("Cantidad Negativos:"+cantNeg);      

    }

    public static void main(String[] args) {
        Transformadas tObj=new Transformadas();
        tObj.contarCerosPostNegMatriz();
    }
}
