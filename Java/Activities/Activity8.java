package Activities;

public class Activity8 {
    public static void main(String[] args){
        try {
            exceptionTest("This is exception");
            exceptionTest(null);
        }
        catch (CustomException exp){
            System.out.println("Catch the exception: " + exp.getMessage());
        }

    }
    static void exceptionTest(String str) throws CustomException {
        if (str == null)
            throw new CustomException("String is null");
        else
            System.out.println(str);
    }

}

class CustomException extends Exception{
    private String message = null;

    public CustomException(String message) {
        message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

