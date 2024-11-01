public interface IMeioTransporte {
    void acelerar();
    void frear();
}

class Carro implements IMeioTransporte {
    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    public void frear() {
        System.out.println("Carro freando.");
    }
}

class Bicicleta implements IMeioTransporte {
    public void acelerar() {
        System.out.println("Bicicleta acelerando.");
    }

    public void frear() {
        System.out.println("Bicicleta freando.");
    }
}

class Trem implements IMeioTransporte {
    public void acelerar() {
        System.out.println("Trem acelerando.");
    }

    public void frear() {
        System.out.println("Trem freando.");
    }
}

// No método principal
public class Main {
    public static void main(String[] args) {
        IMeioTransporte[] transportes = { new Carro(), new Bicicleta(), new Trem() };
        for (IMeioTransporte transporte : transportes) {
            transporte.acelerar();
            transporte.frear();
        }
    }
}
