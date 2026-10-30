public class Main {

    public static void main(String[] args) {

        Contacto contacto = new Contacto(
                "Juan",
                "2615551234",
                "juan@gmail.com"
        );

        System.out.println("\n--- DATOS INICIALES ---");
        System.out.println(contacto.obtenerDatos());

        // Intentar modificar con datos incorrectos
        System.out.println("\n--- DATOS INCORRECTOS ---");

        contacto.setNumeroTelefono("261ABC123");
        contacto.setCorreoElectronico("juangmail.com");

        // Modificar con datos correctos
        System.out.println("\n--- DATOS CORRECTOS ---");

        contacto.setNumeroTelefono("2614445566");
        contacto.setCorreoElectronico("juan@hotmail.com");

        // Mostrar estado final
        System.out.println("\n--- ESTADO FINAL ---");
        System.out.println(contacto.obtenerDatos());
    }
}
