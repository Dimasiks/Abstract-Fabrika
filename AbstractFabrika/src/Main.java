public class Main {
    public static void main (String[] args) {
        Animals [] animal = new Animals[5];
        animal[0] = new Cat();
        animal[1] = new Dog();
        animal[2] = new Wolf();
        animal[3] = new Tiger();
        animal[4] = new Hippo();

        for (int g=0; g<animal.length; g++) {
            animal[g].makeNoise();
        }
    }
}
