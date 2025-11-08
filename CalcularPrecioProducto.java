public class CalcularPrecioProducto {

    public double calcularPrecioProducto(Producto producto){
        double precio = producto.getPrecio() + (producto.getPrecio() * producto.IVA) / 100;
        System.out.println("Precio: " + precio);
        return precio;
    };
}
