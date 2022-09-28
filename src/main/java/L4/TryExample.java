package L4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TryExample {

    public static Logger logger = Logger.getLogger(TryExample.class.getName());

    static {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/log.config");) {
            LogManager.getLogManager().readConfiguration(fileInputStream);
            logger = Logger.getLogger((TryExample.class.getName()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*try {
            //System.exit(0); // will not reach block finalyy
            div(5, 0);
        } catch (ArithmeticException | IOException e) {
            System.out.println("Division by zero");
            e.printStackTrace();
        *//*} catch (IOException e) {
            System.out.println("Surprize");*//*
        }finally {
            System.out.println("finally");
        }

        System.out.println(method());*/

        Exception exception = noCatchMethod();
        System.out.println(exception.getClass());

        System.out.println(catchMethod());
    }

    private static String method() {
        try {
            //do something
            throw new Exception();
        } catch (Exception e) {
            return "wow";
        } finally {
            return "fin";
        }
    }

    private static double div(int a, int b) throws ArithmeticException, IOException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    private static Exception noCatchMethod() {
        try {
            return new ArithmeticException();
        } finally {
            return new MyException(2);
        }
    }

    private static String catchMethod(){
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logger.log(Level.WARNING, "catch exception" + e.getClass());
            return "Catch" + e.getClass();
        } finally {
            Exception exception = new Exception();
            return  "Finally" + exception.getClass();
        }
    }

    private static void getInput() {
        FileInputStream fileInputStream = null;
        try (
                FileInputStream fileInputStream1 = new FileInputStream("SomeFile");
                FileOutputStream fileOutputStream = new FileOutputStream("Smth");
                ){
            fileInputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
