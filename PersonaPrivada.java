public class PersonaPrivada {
    // Atributos privados
    private String nombre;
    private int edad;
    private double altura;

    // Constructor
    public PersonaPrivada(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Método público para mostrar datos: Imprime los valores de los atributos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Altura: " + altura);
    }

    // Método público para verificar si es mayor de edad: : Devuelve un valor booleano que indica si la persona tiene más de 18 años.
    public boolean esMayorDeEdad() {
        return edad > 18;
    }
}
