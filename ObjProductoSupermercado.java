public class ObjProductoSupermercado {
    private String NombrePS;
    private Double PrecioPS;
    private int Stock;

    public ObjProductoSupermercado() {
    }

    public ObjProductoSupermercado(String NombrePS, Double PrecioPS, int Stock) {
        this.NombrePS = NombrePS;
        this.PrecioPS = PrecioPS;
        this.Stock = Stock;
    }

    public String getNombrePS() {
        return NombrePS;
    }

    public void setNombrePS(String NombrePS) {
        this.NombrePS = NombrePS;
    }

    public Double getPrecioPS() {
        return PrecioPS;
    }

    public void setPrecioPS(Double PrecioPS) {
        this.PrecioPS = PrecioPS;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }


}
