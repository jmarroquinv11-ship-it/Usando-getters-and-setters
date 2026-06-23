package encapsulamiento;

public class Inicio {

    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 1 ===");
        Persona persona = new Persona("Pedro", "Perez", 20);
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());

        System.out.println("\n=== EJERCICIO 2 ===");
        Producto producto = new Producto("P01", "Mouse", 150.00, 10);
        System.out.println("Stock inicial: " + producto.getStock());
        producto.vender(3);
        System.out.println("Stock final: " + producto.getStock());

        System.out.println("\n=== EJERCICIO 3 ===");
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 1000, 1234);
        cuenta.retirar(100, 1234);
        cuenta.retirar(100, 1111);

        System.out.println("\n=== EJERCICIO 4 ===");
        Curso curso = new Curso("POO", 80, 90, 70);
        System.out.println("Promedio: " + curso.promedio());
        System.out.println("Estado: " + curso.estado());

        System.out.println("\n=== EJERCICIO 5 ===");
        Estudiante estudiante = new Estudiante("20250082", "Maria", 90);
        System.out.println("Becado: " + estudiante.esBecado());

        System.out.println("\n=== EJERCICIO 6 ===");
        Termometro termometro = new Termometro();
        termometro.setCelsius(25);
        System.out.println("Fahrenheit: " + termometro.getFahrenheit());

        System.out.println("\n=== EJERCICIO 7 ===");
        Reloj reloj = new Reloj();
        reloj.setHora(14);
        reloj.setMinuto(30);
        reloj.setSegundo(15);
        System.out.println(reloj.mostrarHora());

        System.out.println("\n=== EJERCICIO 8 ===");
        Contacto contacto = new Contacto("Luis", "12345678", "correo@gmail.com");
        contacto.mostrarContacto();

        System.out.println("\n=== EJERCICIO 9 ===");
        Jugador jugador = new Jugador("Carlos");
        jugador.actualizarPuntaje(150);
        jugador.actualizarPuntaje(200);
        System.out.println("Puntaje actual: " + jugador.getPuntajeActual());
        System.out.println("Puntaje máximo: " + jugador.getPuntajeMaximo());

        System.out.println("\n=== EJERCICIO 10 ===");
        Factura factura = new Factura("F001", "Laptop", 2, 5000);
        factura.mostrarFactura();
    }
}