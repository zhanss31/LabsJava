package lab1;

public class Pair {
    private  Object key;
    private  Object value;
    public Pair(Object Key, Object Value) {

        this.key   = Key;
        this.value = Value;
    }

    public Object key()   { return key; }
    public Object value() { return value; }
}
