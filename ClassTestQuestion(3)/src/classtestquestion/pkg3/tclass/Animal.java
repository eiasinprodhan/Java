package classtestquestion.pkg3.tclass;

public class Animal {
    
    private String sound;

    public Animal() {
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    
    public void makeSound(){
        System.out.print(sound);
    }
}
