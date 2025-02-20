import java.util.Scanner;

public class ObjLibreria {
    private String Titulo;
    private String Autor;
    private Double Precio;

    public ObjLibreria() {
    }

    public ObjLibreria(String titulo, String autor, Double precio) {
        Titulo = titulo;
        Autor = autor;
        Precio = precio;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public void MostrarMatrizLibreria(ObjLibreria[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                System.out.println("\n Titulo: " + m[i][j].getTitulo());
                System.out.println("\n Autor: " + m[i][j].getAutor());
                System.out.println("PRECIO: " + m[i][j].getPrecio());
                System.out.println("\n");
            }
        }
    }

    public String LibroMayorPrecio(ObjLibreria[][] m) {
        Double libroMayor = 0.0;
        ObjLibreria o = new ObjLibreria();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getPrecio() > libroMayor) {
                    // ObjLibreria o = new ObjLibreria();
                    libroMayor = m[i][j].getPrecio();
                    o.setTitulo(m[i][j].getTitulo());
                    o.setAutor(m[i][j].getAutor());
                    o.setPrecio(m[i][j].getPrecio());
                }
            }
        }
        return "el libro con mayor valor es: " + libroMayor + "Con titulo: " + o.getTitulo() + "y el autores: "
                + o.getAutor();
    }
    public ObjLibreria[][] LlenarMatrizLibreria(int d) {
        ObjLibreria[][] m = new ObjLibreria[d][d];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjLibreria o = new ObjLibreria();
                System.out.println("Ingrese el Titulo");
                o.setTitulo(sc.next());
                System.out.println("Ingrese el Autor");
                o.setAutor(sc.next());
                System.out.println("Ingrese el Precio");
                while (!sc.hasNextDouble()) {
                    System.out.println("el valor del precio es incorrecto");
                    sc.next();
                }
                o.setPrecio(sc.nextDouble());
                m[i][j] = o;
            }
        }
        return m;
    }

}
