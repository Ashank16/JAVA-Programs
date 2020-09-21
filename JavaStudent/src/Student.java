//Constructors
public class Student {
    
    int id;
    String name;
    
    Student(int i, String n) {
        id = i;
        name = n;
    }
    
    void display() {
        System.out.println("Name is : " + name + " and id is : " + id);
    }

    public static void main(String[] args) {
        Student Arjun = new Student(45,"Arjun");
        Student Karan = new Student(46,"Karan");
        //calling display method
        Arjun.display();
        Karan.display();
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
