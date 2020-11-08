public class WaitNotify {
    private static final long SLEEP_INTERVAL = 3000;
    private boolean running = true;
    private Thread thread;
    public void start() {
        print("Inside start() method");
        thread = new Thread(new Runnable() {
            public void run() {
                print("Inside run() method");
                try {
                    Thread.sleep(SLEEP_INTERVAL);
                } 
                catch(InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                synchronized(WaitNotify.this) {
                    running = false;
                    WaitNotify.this.notify();
                }
            }
        });
        thread.start();
    }
    public void join() throws InterruptedException {
        print("Inside join() method");
        synchronized(this) {
            while(running) {
                print("Waiting for the peer thread to finish.");
                wait();                     //waiting, not running
            }
            print("Peer thread finished.");
        }
    }
    private void print(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) throws InterruptedException {
        WaitNotify test = new WaitNotify();
        test.start();
        test.join();
        System.out.println("Ashank Juyal\n45-IT-18");
    }
}
