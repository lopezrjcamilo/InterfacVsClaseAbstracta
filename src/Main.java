public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Toby");
        perro.hacerSonido();
        perro.dormir();
        perro.moverCola();

        Gato gato = new Gato("Luna");
        gato.hacerSonido();
        gato.dormir();
        gato.moverCola();

        Vaca vaca = new Vaca("Margarita");
        vaca.hacerSonido();
        vaca.dormir(); // Utiliza la implementación modificada en la clase Vaca
        vaca.moverCola(); // Hereda la implementación de la clase abstracta
        vaca.comerHierba(); // Nuevo método en la clase Vaca
    }
}