import java.util.Scanner;

public class Punto5 {
    
    public void P5 (int d) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        int filas = 0, columnas = 0, filas1 = 0, columnas1= 0;
        System.out.println("Ingrese las filas de la matriz 1: ");
        filas = sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz 1: ");
        columnas = sc.nextInt();

        System.out.println("LLenar los datos de la matriz 1: ");
        ObjProductoSupermercado[][] m1 = new ObjProductoSupermercado[filas][columnas];
        m1 = m.LlenarMatrizSupermercado(filas, columnas);

        System.out.println("Ingrese las filas de la matriz 2: ");
        filas1 = sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz 2: ");
        columnas1 = sc.nextInt();


        ObjProductoSupermercado[][] m2 = new ObjProductoSupermercado[filas1][columnas1];
        m2 = m.LlenarMatrizSupermercado(filas1, columnas1);

        if(m1.length > m2.length){
            
            m1 = m.SumarStock(m1, m2);
        }
        else if (m1.length < m2.length) {

            m2 = m.SumarStock(m1, m2);
        }
        else {
            m1 = m.SumarStock(m1, m2);
        }
    }
}
