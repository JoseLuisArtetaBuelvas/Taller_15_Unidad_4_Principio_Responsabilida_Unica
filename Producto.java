public class Producto {
    private String nombreProducto;
    private double precio;
    private String fabricante;
    final public double IVA = 0.19;

    public void setNombre(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public String getNombre(){
        return nombreProducto;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getFabricante(){
        return fabricante;
    }
}
