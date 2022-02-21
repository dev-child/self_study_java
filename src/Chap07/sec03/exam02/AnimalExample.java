package Chap07.sec03.exam02;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog("포유류");
        Cat cat = new Cat("포유류");
        dog.sound();
        cat.sound();
        System.out.println("----------------");


        Animal animal = null;
        animal = new Dog("개");
        animal.sound();
        animal = new Cat("고양이");
        animal.sound();
        System.out.println("--------------");
        
        animalSound(new Dog("개"));
        animalSound(new Cat("고양이"));

    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
    
}
