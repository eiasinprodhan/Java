package pkgtry;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Try {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(50);
        
        for(int i = 1; i <= 50; i++){
            Runnable task = new JFreame(i);
            executor.submit(task);
        }
        
        executor.shutdown();
    }
}
