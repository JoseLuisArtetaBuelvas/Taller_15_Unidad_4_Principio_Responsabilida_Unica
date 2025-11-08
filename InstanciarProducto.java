public class InstanciarProducto {
    public static void main(String[] args) {
        Producto producto = new Producto();
        CalcularPrecioProducto calcularPrecioProducto = new CalcularPrecioProducto();
        GeneracionDeEtiquetas generacionDeEtiquetas = new GeneracionDeEtiquetas();
        producto.setNombre("Picada");
        producto.setPrecio(40000);
        producto.setFabricante("Doña Luz");
        producto.getNombre();
        producto.getPrecio();
        producto.getFabricante();
        double precioFinal = calcularPrecioProducto.calcularPrecioProducto(producto);
        String etiqueta = generacionDeEtiquetas.generarEtiquetas(producto, precioFinal);
        System.out.println(etiqueta);
    }
}
