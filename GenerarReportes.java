public class GenerarReportes {
    public String generarReporte(Libro libro){
        String reporte = "";
        reporte += "Titulo: " +libro.getTitulo() + " - ";
        reporte += "Autor: " +libro.getAutor() + " ";
        return reporte;
    }
}
