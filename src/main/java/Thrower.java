import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thrower {


    public void throwException() throws IOException {

    }

    public void  throwCustomException() throws customException {
        throw new customException();
    }
}
