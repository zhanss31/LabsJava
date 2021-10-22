package lab1;

public class Map {
    private List key;
    private List value;

    public Map() {

        this.key= new List();
        this.value=new List();
    }

    public Map(List key, List value) {

        this.key= key;
        this.value=value;
    }

    public Map(Map mp) {

        this.key=new List(mp.key);
        this.value=new List(mp.value);
    }

    public void put(Object key, Object value) {

        if(this.key.contains(key)) {
            for (int i = 0; i < this.key.size(); i++) {
                if (this.key.get(i) == key)
                    this.value.set(value, i);
            }
        }
        else {
            this.key.add(key);
            this.value.add(value);
        }
    }

    public Object get(Object key) {

        for(int i=0;i<this.key.size();i++) {
            if(this.key.get(i)==key)
                return this.value.get(i);
        }
        return null;
    }

    public Object get(Object key, Object bydefault) {

        if(this.keyContains(key)) {
            for(int i=0;i<this.key.size();i++) {
                if(this.key.get(i)==key) {
                    if (this.value.get(i)== null) {
                        put(key,bydefault);
                        return this.value.get(i);
                    }
                    else
                        return this.value.get(i);
                }
            }
        }
        else
            put(key,bydefault);

        return bydefault;
    }

    public Object remove(Object key) {

        if(this.keyContains(key)) {
            for(int i=0;i<this.key.size();i++){
                if(this.key.get(i)== key) {
                    this.key.remove(i);
                    return this.value.remove(i);

                }
            }

        }
        return null;
    }

    public boolean keyContains(Object key) {

        for(int i=0;i<this.key.size();i++) {
            if(this.key.get(i)==key)
                return true;
        }
        return false;
    }

    public List getKeys() {return this.key;}

    public List getValues() {return this.value;}

    public List getEntries(){
        List a= new List();
        for(int i=0;i<this.key.size();i++){
            Pair b =new Pair(this.key.get(i),this.value.get(i));

            a.add(b,i);
        }
        return a;
    }

    public int size()  { return this.key.size();}

    public boolean isEmpty() {return this.key.IsEmpty();}
}
