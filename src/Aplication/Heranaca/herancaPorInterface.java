package POO.src.Aplication.Heranaca;

interface one {
    public void print_geek();
}

interface two {
    public void print_for();
}

/*
 * A interfce 3 deriva da interface doi e um:
 */
interface three extends one, two {
    public void print_geek();
}

class child implements three {
    @Override
    public void print_geek() {
        System.out.println("Geeks");
    }

    public void print_for() {
        System.out.println("for");
    }
}

// Drived class
public class herancaPorInterface {
    public static void main(String[] args) {
        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}