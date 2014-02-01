/**
 * Created by chrisditchburn on 01/02/2014.
 *
 * This is a simple test used to learn GitHub
 *
 */
public class test{

    public static void main(String[] args)  {

        try {
            Integer numberOne = 1;
            Integer numberTwo = 2;
            Integer result = numberOne * numberTwo;

            result++;
            System.out.println(result.toString());

        } catch (Exception exception) {
            System.out.println(exception.toString());

        }
    }
}
