package t_12_errorHandingWithExceptions.ex13;

import java.util.Random;

import t_12_errorHandingWithExceptions.ex09.Thrower;
import t_12_errorHandingWithExceptions.ex09.exceptions.FirstEx;
import t_12_errorHandingWithExceptions.ex09.exceptions.SecondEx;
import t_12_errorHandingWithExceptions.ex09.exceptions.ThirdEx;

public class App {
    public static void main(String[] args)
    {
        Thrower thrower = new Thrower();
        try
        {
            // thrower.throwException(new Random().nextInt(3));
            throw null;
        }
        catch (FirstEx | SecondEx | ThirdEx ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            System.out.println("This is finally clause");
        }
    }
}
