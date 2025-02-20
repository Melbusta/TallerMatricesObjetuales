import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjProducto[][] LlenarMatriz(int d) {
        ObjProducto[][] m = new ObjProducto[d][d];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjProducto o = new ObjProducto();
                System.out.println("Ingrese el nombre producto");
                o.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto");
                o.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la cantidad");
                o.setCantidad(sc.nextInt());
                m[i][j] = o;
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

   

    public String BuscadorProducto(ObjProducto[][] m) {
        String mensaje = "", MensajeResult = "";
        System.out.println("Ingrese el nombre del producto: ");
        mensaje = sc.next();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getNombre().toLowerCase().equals(mensaje)) {
                    MensajeResult = "El producto se encuentra en la fila " + (i + 1) + " en la columna " + (j + 1);
                }
            }
        }
        return MensajeResult;
    }

    

    public int CalcularInventario(ObjProducto[][] m) {
        int total = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != null) {
                    total += m[i][j].getCantidad();
                }
            }
        }
        return total;
    }
}
