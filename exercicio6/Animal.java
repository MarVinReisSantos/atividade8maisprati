public abstract class Animal {
    public abstract void emitirSom();
}

class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("Cachorro faz au au");
    }
}

class Gato extends Animal {
    public void emitirSom() {
        System.out.println("Gato faz miau");
    }
}

class Vaca extends Animal {
    public void emitirSom() {
        System.out.println("Vaca faz muu");
    }
}

// No método principal
public class Main {
    public static void main(String[] args) {
        Animal[] animais = { new Cachorro(), new Gato(), new Vaca() };
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
