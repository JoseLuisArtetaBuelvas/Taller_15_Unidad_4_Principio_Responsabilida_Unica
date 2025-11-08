//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class InstanciarLibro {
    public static void main(String[] args) {
        Libro libro = new Libro();
        GenerarReportes generarReportes = new GenerarReportes();
        libro.setTitulo("Titulo del libro");
        libro.setAutor("Autor del libro");
        libro.getTitulo();
        libro.getAutor();
        libro.pedirPrestadoLibro();
        libro.guardarEnBaseDeDatos();
        String reporte = generarReportes.generarReporte(libro);
        System.out.println(reporte);
    }
}