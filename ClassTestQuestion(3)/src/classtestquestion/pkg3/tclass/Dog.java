package classtestquestion.pkg3.tclass;


public class Dog extends Animal{

    public Dog() {
    }
    
    @Override
    public void makeSound() {
        System.out.print("Dog makes ");
        super.makeSound();
        System.out.println(" sound");
    }
    
}
