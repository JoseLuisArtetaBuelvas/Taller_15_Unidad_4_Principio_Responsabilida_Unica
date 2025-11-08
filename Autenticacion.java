public class Autenticacion {
    public boolean autenticar(Usuario usuario) {
        return usuario.getNombre().equals("Jose") && usuario.getContrasena().equals("12345") && usuario.getTipoUsuario().equals("Administrador");
    }
}
