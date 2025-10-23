public class buscar {
    public static void main(String[] args) {
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int[] filas: matriz){
            for (int columnas: filas){
                System.out.print(columnas + " ");
            }
            System.out.println();
        }
    }
}
