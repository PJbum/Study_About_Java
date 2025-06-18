class MessagePrinter implements Runnable {
    public String message;
    public int count;

    public MessagePrinter(String message, int count) {
        this.message = message;
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}
public class MessagePrinterDemo {
    public static void main(String[] args) {
        Runnable taskA = new MessagePrinter("Hello from Thread A", 2);
        Runnable taskB = new MessagePrinter("Hello from Thread B", 2);

        Thread threadA = new Thread(taskA);
        Thread threadB = new Thread(taskB);

        threadA.start();
        threadB.start();
    }
}
