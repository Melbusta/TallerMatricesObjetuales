public class Punto2 {
    public void P2 (int d) {
        Metodos M = new Metodos();
        ObjProducto[][] m = new ObjProducto[d][d];
        m = M.LlenarMatriz(d);
        M.MostrarMatriz(m);
        M.CalcularInventario(m);
        
        System.out.println("");
    }
}
