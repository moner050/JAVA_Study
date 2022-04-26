package ch07.CustomException;

public class MinusScoreException extends RuntimeException{

    public MinusScoreException(String message)
    {
        super(message);
    }
}
