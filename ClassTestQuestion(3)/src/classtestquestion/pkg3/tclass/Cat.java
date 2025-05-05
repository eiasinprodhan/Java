package classtestquestion.pkg3.tclass;

public class Cat extends Animal{

    public Cat() {
    }

    @Override
    public void makeSound() {
        System.out.print("Cat makes ");
        super.makeSound();
        System.out.println(" sound");
    }
}
