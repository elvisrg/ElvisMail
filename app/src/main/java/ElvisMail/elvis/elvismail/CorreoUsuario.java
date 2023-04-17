package ElvisMail.elvis.elvismail;

public class CorreoUsuario {
    private String nombre, telefono, ciudad;
    private int imgLetra;

    public CorreoUsuario() {
    }

    public CorreoUsuario(String nombre, String telefono, String ciudad, int imgLetra) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.imgLetra = imgLetra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getImgLetra() {
        return imgLetra;
    }

    public void setImgLetra(int imgLetra) {
        this.imgLetra = imgLetra;
    }
}
