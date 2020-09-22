public class Static {  
    static int count = 0;  

    Static() {  
        count++;  
        System.out.println(count);  
    }
    
    public static void main(String[] args) {
        Static one = new Static();
        Static two = new Static();
        Static three = new Static();
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
