public class InstanciarUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Autenticacion autenticacion = new Autenticacion();
        usuario.setNombre("Jose");
        usuario.setContrasena("12345");
        usuario.setTipoUsuario("Administrador");
        usuario.getNombre();
        usuario.getContrasena();
        usuario.getTipoUsuario();
        boolean autenticar = autenticacion.autenticar(usuario);
        System.out.println("La autenticación es: " + autenticar);
    }
}
