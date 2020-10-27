class Data {
    private String s1 = "Inside private";
    protected String s2 = "Inside protected";
    public String s3 = "Inside public";
}

public class AccessSpecifier {

    public static void main(String[] args) {
        Data d = new Data();
        //System.out.println(d.s1);  //Raises Error
        System.out.println(d.s2);
        System.out.println(d.s3);
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
