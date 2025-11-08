public class GeneracionDeEtiquetas {
    public String generarEtiquetas(Producto producto, double precioFinal){
        String etiqueta = "Etiqueta Generada ";
        etiqueta += "Nombre: " + producto.getNombre() + " - ";
        etiqueta += "Fabricante: " + producto.getFabricante() + " - ";
        etiqueta += "Precio: " + precioFinal;
        return etiqueta;
    }
}
