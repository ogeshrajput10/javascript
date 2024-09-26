// Define a custom exception
class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}
public class CustomExceptionExample {
    public static void validateAge(int age) throws AgeNotValidException {
        if (age < 20) {
            throw new AgeNotValidException("Age is not valid for registration.");
        }
        System.out.println("Age is valid.");
    }
    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}

