
package liststackqueues;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("Foysal");
        names.add("Ovi");
        names.add("Eiasin");
        names.add("Reja");
        names.add("Rahmatullah");
        names.add("Rakbi");
        System.out.println(names);
        names.add(3, "Mazda");
        System.out.println(names.get(2));
        System.out.println(names);
    }
}
