public class Coche {
    //1-atributos
    String nombre;
    String modelo;
    String motor;
    String color;
    int velocidad;
    int puertas;

    //2-constructores
    public Coche() {
    }

    public Coche(String nombre, String modelo, String motor, String color, int puertas) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.motor = motor;
        this.color = color;
        this.puertas = puertas;
    }
    //3-metodos
    public int acelerar(Integer cantidad) {
        this.velocidad+=cantidad;
        return velocidad;
    }

    // creo el método toString() para poder acceder a los valores de los atributos de los elementos de mi base de datos.
    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                ", puertas=" + puertas +
                '}';
    }
}
