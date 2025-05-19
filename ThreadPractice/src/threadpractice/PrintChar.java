package threadpractice;

public class PrintChar implements Runnable{
    private char letter;
    private int limit;

    public PrintChar() {
    }

    public PrintChar(char letter, int limit) {
        this.letter = letter;
        this.limit = limit;
    }
    
    

    @Override
    public void run() {
        for(int i=1; i<=limit; i++){
            System.out.print(letter + ", ");
        }
        }
    
}
