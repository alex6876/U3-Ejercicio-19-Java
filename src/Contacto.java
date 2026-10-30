
public class Contacto {

    private String nombre;
    private String numeroTelefono;
    private String correoElectronico;

    public Contacto(String nombre, String numeroTelefono, String correoElectronico) {
        this.nombre = nombre;
        this.numeroTelefono = "";
        this.correoElectronico = "";

        setNumeroTelefono(numeroTelefono);
        setCorreoElectronico(correoElectronico);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroTelefono(String numeroTelefono) {

        if (numeroTelefono != null && numeroTelefono.matches("[0-9+() -]+")) {
            this.numeroTelefono = numeroTelefono;
            System.out.println("Teléfono actualizado correctamente.");
        } else {
            System.out.println("Error: el teléfono no puede contener letras.");
        }
    }

    public void setCorreoElectronico(String correoElectronico) {

        if (correoElectronico != null && correoElectronico.contains("@")) {
            this.correoElectronico = correoElectronico;
            System.out.println("Correo actualizado correctamente.");
        } else {
            System.out.println("Error: el correo debe contener @.");
        }
    }

    public String obtenerDatos() {
        return "Nombre: " + nombre +
                "\nTeléfono: " + numeroTelefono +
                "\nCorreo: " + correoElectronico;
    }
}
