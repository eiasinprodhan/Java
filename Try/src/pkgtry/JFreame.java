
package pkgtry;

public class JFreame implements Runnable{
    int taskId;

    public JFreame() {
    }

    public JFreame(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task" + taskId + " is running on theard " + Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Task " + taskId + " was interrupyed");
        }
        System.out.println("Task " + taskId + " completed by " + Thread.currentThread().getName());
    }
    
    
}
