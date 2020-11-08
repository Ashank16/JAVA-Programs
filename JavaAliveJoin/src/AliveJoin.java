public class AliveJoin extends Thread {
    public void run() {
       	System.out.println("r1 ");
       	try {
            Thread.sleep(500);
    	}
        catch(InterruptedException e){ }
        System.out.println("r2 ");
    }
    public static void main(String[] args) {
        System.out.println("Ashank Juyal\n45-IT-18");
        AliveJoin t1=new AliveJoin();
        AliveJoin t2=new AliveJoin();
        t1.start();
        try {
            t1.join();	                 //Waiting for t1 to finish
        }
        catch(InterruptedException e){ }
        t2.start();
        System.out.println("t1.isAlive() : " + t1.isAlive());
	System.out.println("t2.isAlive() : " + t2.isAlive());        
    }    
}
