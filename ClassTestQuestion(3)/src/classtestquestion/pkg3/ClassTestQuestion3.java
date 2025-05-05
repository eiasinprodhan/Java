
package classtestquestion.pkg3;

import classtestquestion.pkg3.tclass.Cat;
import classtestquestion.pkg3.tclass.Dog;

public class ClassTestQuestion3 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setSound("Bhaw Bhaw");
        dog.makeSound();
        
        Cat cat = new Cat();
        cat.setSound("Mew Mew");
        cat.makeSound();
    }
    
}
