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

    public ObjProductoSupermercado[][] LlenarMatrizSupermercado(int f, int c) {
        ObjProductoSupermercado[][] m = new ObjProductoSupermercado[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                ObjProductoSupermercado o = new ObjProductoSupermercado();
                System.out.println("Ingrese el nombre producto: ");
                o.setNombrePS(sc.next());
                System.out.println("Ingrese el precio: ");
                o.setPrecioPS(sc.nextDouble());
                System.out.println("Ingrese el stock: ");
                o.setStock(sc.nextInt());
                m[i][j] = o;
            }
        }
        return m;
    }

    public ObjProductoSupermercado[][] SumarStock(ObjProductoSupermercado[][] m, ObjProductoSupermercado[][] n) {

        if (m.length > n.length) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    for (int i2 = 0; i2 < n.length; i2++) {
                        for (int j2 = 0; j2 < n[0].length; j2++) {
                            if (m[i][j].getNombrePS().equalsIgnoreCase(n[i2][j2].getNombrePS())) {
                                m[i][j].setStock(m[i][j].getStock() + n[i2][j2].getStock());
                            }
                        }
                    }

                }
            }
            return m;
        } else if(m.length < n.length){
            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < n[0].length; j++) {
                    for (int i2 = 0; i2 < m.length; i2++) {
                        for (int j2 = 0; j2 < m[0].length; j2++) {
                            if (n[i][j].getNombrePS().equalsIgnoreCase(m[i2][j2].getNombrePS())) {
                                n[i][j].setStock(m[i][j].getStock() + m[i2][j2].getStock());
                            }
                        }
                    }
                }
            }
            return n;
        } else {
            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < n[0].length; j++) {
                    for (int i2 = 0; i2 < m.length; i2++) {
                        for (int j2 = 0; j2 < m[0].length; j2++) {
                            if (n[i][j].getNombrePS().equalsIgnoreCase(m[i2][j2].getNombrePS())) {
                                n[i][j].setStock(m[i][j].getStock() + m[i2][j2].getStock());
                            }
                        }
                    }
                }
            }
            return n;
        }
    }

    public void MostrarMatrizPunto5(ObjProductoSupermercado[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                System.out.println("\n NOMBRE: " + m[i][j].getNombrePS());
                System.out.println("PRECIO: " + m[i][j].getPrecioPS());
                System.out.println("STOCK: " + m[i][j].getStock());
                System.out.println("\n");
            }
        }
    }
}