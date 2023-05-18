public class Perro extends Mamifero{
    public Perro(String nombre) {
        super(nombre);
    }

    // Implementación del método hacerSonido de la interfaz Animal
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: ¡Guau guau!");
    }

    @Override
    public void moverCola() {
        super.moverCola();
    }
}
