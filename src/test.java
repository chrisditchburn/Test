import java.lang.Exception;
import java.lang.*;

/**
 * Created by chrisditchburn on 01/02/2014.
 */
public class test{

    public static void main(String[] args)  {

        try {
            Integer numberOne = new Integer(1);
            Integer numberTwo = new Integer(2);
            Integer result = numberOne * numberTwo;
            System.out.println(result.toString());

        } catch (Exception exception) {
            System.out.println(exception.toString());

        }
    }
}
