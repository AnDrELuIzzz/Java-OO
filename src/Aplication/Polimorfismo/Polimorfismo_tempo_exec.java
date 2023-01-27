package POO.src.Aplication.Polimorfismo;

/**
 * Bike
 */
class Bike {
    void run() {
        System.out.println("Correndo");
    }
}

public class Polimorfismo_tempo_exec extends Bike { /* COnsidere a classe com o nome Splendor */
    void run() {
        System.out.println("Correndo seguro á 60 km");
    }

    public static void main(String[] args) {
        Bike b = new Polimorfismo_tempo_exec(); // upcasting
        b.run();
    }
    /*
     * Upcasting é qundo um objeto da classe Bike re ferencia ao objeto da classe
     * Slendor
     */
}
