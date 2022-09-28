package L4;

import java.io.IOException;

public class MyException extends IOException {
    private  int detail;
    public MyException(int error) {
        detail = error;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
