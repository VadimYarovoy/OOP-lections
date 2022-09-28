package L6;

import L3.annatation.Person;

public class ClassesExample {
    public static void main(String[] args) {
        Class<Person> c1 = Person.class;
        System.out.println(c1);

        Person person = new Person();
        Class<? extends Person> c2 = person.getClass();
        System.out.println(c2);

        try {
            Class<?> c3 =  Class.forName("L3.annatation.Person");
            System.out.println(c3);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Class<?> c4 = Integer.TYPE;
        System.out.println(c4);

        Class<?> c5 = Void.TYPE;
        System.out.println(c5);
    }
}
