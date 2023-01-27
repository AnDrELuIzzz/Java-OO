package POO.src.Aplication.Heranaca;

/* IS-A é uma maneira de dizer: Este objeto é um tipo desse objeto. Vamos ver como a palavra-chave estende é usada para alcançar a herança.*/
class SolarSystem {
}

class Earth extends SolarSystem {
}

class Mars extends SolarSystem {
}

public class JavaIs extends Earth { // considere javaIs como moon(lua)
    public static void main(String args[]) {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
    }
}