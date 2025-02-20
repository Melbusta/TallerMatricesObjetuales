import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        int opt = 0;
        int d = 0;
        ObjProducto[][] M = new ObjProducto[d][d];
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese la opción deseada del 1 al 10: " + "\n" +
                    "si desea salir pulse 15");
            while (!sc.hasNextInt()) {
                System.out.println("dato incorrecto por favor valide.....");
                sc.next();
            }
            opt = sc.nextInt();
            System.out.println("Ingrese la dimensión de la matriz: ");
            d = sc.nextInt();
            switch (opt) {
                case 1:
                    Punto1 p1 = new Punto1();
                    p1.P1(d);
                    break;
                case 2:
                    Punto2 p2 = new Punto2();
                    p2.P2(d);
                    break;
                    case 3:
                    Punto3 p3 = new Punto3();
                    p3.punto3(d);
                    break;
                case 15:
                    System.out.println("hasta pronto");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

    }
}