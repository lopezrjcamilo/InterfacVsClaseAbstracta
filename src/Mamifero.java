public abstract class Mamifero implements Animal {
    private String nombre;

    public Mamifero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método dormir de la interfaz Animal
    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo...");
    }

    // Método concreto en la clase abstracta
    public void moverCola() {
        System.out.println(nombre + " está moviendo la cola.");
    }
}