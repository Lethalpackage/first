import java.io.IOException;

public class main {

    public static void main(String[] args) {

     Thrower thrower = new Thrower();

        try {
            thrower.throwCustomException();
        } catch (customException e) {
            System.out.println(e.exception);
        }
    }
}


