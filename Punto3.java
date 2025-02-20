public class Punto3 {
    public void punto3(int d) {
        ObjLibreria M = new ObjLibreria();
        ObjLibreria[][] m = M.LlenarMatrizLibreria(d);
        M.MostrarMatrizLibreria(m);
        System.out.println(M.LibroMayorPrecio(m));
    }
}
