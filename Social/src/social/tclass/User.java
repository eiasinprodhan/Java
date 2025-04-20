package social.tclass;

public class User {

    String username;
    String email;
    String password;

    String[] usernameArray = {"Eiasin", "Rakib", "Parvej", "Reja", "Sadiar", "Atik"};
    String[] emailArray = {"eiasin@gmail.com", "rakib@gmail.com", "parvej@gmail.com", "reja@gmail.com", "sadiar@gmail.com", "atik@gmail.com"};
    String[] passwordArray = {"Eiasin123", "Rakib123", "Parvej123", "Reja123", "Sadiar123", "Atik123"};

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void Login(String email, String password) {
        for (int i = 0; i < emailArray.length; i++) {

            if (email.equalsIgnoreCase(emailArray[i])) {
                int index = i;
                if (password.equalsIgnoreCase(passwordArray[index])) {
                    System.out.println("Welcome Back, " + usernameArray[index]);
                } else {
                    System.err.println("Wrong password.");
                }
                break;
            }

            if (i == emailArray.length - 1) {
                System.err.println("Wrong username or password");
            }
        }

    }
    
    public void Registration(String username, String email, String password){
        System.out.println("Registration complete.");
    }
}
