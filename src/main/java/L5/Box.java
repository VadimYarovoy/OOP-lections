package L5;

public class Box<T extends Number> implements Comparable<Box>{
    private T obj;
    //private T[] array = new T[5]; // нельзя создать массив типа
    //static T someVar;

    public void addObjectToBox(Object o) {
        this.obj = (T) o;
    }


    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public int compareTo(Box o) {
        if( o.getObj().intValue() < obj.intValue()) {
            return 1;
        } else if ( o.getObj().intValue() > obj.intValue()){
            return -1;
        } else {
            return 0;
        }
    }
}
