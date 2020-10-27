class InvalidProductException extends Exception {
    public InvalidProductException(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}

public class ThrowException {
    void productCheck(int weight) throws InvalidProductException {
        if(weight<100){
            throw new InvalidProductException("Product Invalid");
        }
    }

    public static void main(String[] args) {
        ThrowException obj = new ThrowException();
        try {
            obj.productCheck(60);
        }
        catch (InvalidProductException e) {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}