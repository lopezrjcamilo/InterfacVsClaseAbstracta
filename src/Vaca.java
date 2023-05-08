public class Vaca extends Mamifero {
    public Vaca(String nombre) {
        super(nombre);
    }

    // Implementación del método hacerSonido de la interfaz Animal
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: ¡Muu muu!");
    }

    // Implementación modificada del método dormir
    @Override
    public void dormir() {
        System.out.println(getNombre() + " está durmiendo profundamente...");
    }

    // Nuevo método concreto agregado
    public void comerHierba() {
        System.out.println(getNombre() + " está comiendo hierba.");
    }
}