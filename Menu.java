import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        int opt = 0;
        int d = 0;
        ObjProducto[][] M = new ObjProducto[d][d];

        System.out.println("Ingrese la opción deseada del 1 al 10: ");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                ObjProducto p1 = new ObjProducto();
                m.LlenarMatriz(d);
                m.MostrarMatriz(M);
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}