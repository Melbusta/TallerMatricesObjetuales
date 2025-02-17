import java.util.Scanner;
public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjProducto[][] LlenarMatriz (int d) {
        ObjProducto[][] m = new ObjProducto[d][d];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjProducto obj = new ObjProducto();
                System.out.println("Ingrese el nombre del producto: ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto: ");
                obj.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la cantidad del producto: ");
                obj.setCantidad(sc.nextInt());
                m[i][j] = obj;
            }
        }
        return m;
    }
    
    public void MostrarMatriz(ObjProducto[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                System.out.println("\n NOMBRE: " + m[i][j].getNombre());
                System.out.println("PRECIO: " + m[i][j].getPrecio());
                System.out.println("CANTIDAD: " + m[i][j].getCantidad());
                System.out.println("\n");
            }
        }
    }
}
