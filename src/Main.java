public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Animal animal = new Animal("cow");
        System.out.println(animal.getName());

        Animal animal2 = (Animal) animal.clone();
        animal2.setName("dog");
        System.out.println(animal2.getName());

    }
}