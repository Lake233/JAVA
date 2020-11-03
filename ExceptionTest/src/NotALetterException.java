public class NotALetterException extends Exception{
    static int count = 0;
    String message;

    public NotALetterException(String s){
        message = s;
    }

    public static void countLetter(char c) throws NotALetterException{
        if(Character.isAlphabetic(c))
            count++;
        else
            throw new NotALetterException(c + " is not a letter.");
    }
}
