public class Libro {
    private String titulo;
    private String autor;
    private Boolean esPrestado = false;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void pedirPrestadoLibro(){
        if(!esPrestado){
            esPrestado = true;
        }
    }

    public void guardarEnBaseDeDatos(){
        System.out.println("Guardando datos");
    }
}
