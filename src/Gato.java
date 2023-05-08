public class Gato extends Mamifero {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: ¡Miau miau!");
    }

    @Override
    public void dormir() {
        System.out.println(getNombre() + " está durmiendo...");
    }
}
