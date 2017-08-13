/**
 * Created by gagandhillon on 8/12/17.
 */
public class FizzBuzz {

    public String fizz(Integer inputNumber){
        if ((inputNumber % 3 == 0) && (inputNumber % 5 == 0))
            return "FizzBuzz";
        if (inputNumber % 3 == 0)
            return "Fizz";
        else if (inputNumber % 5 == 0)
            return "Buzz";
        return inputNumber.toString();
    }

}
