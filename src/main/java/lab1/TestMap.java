package lab1;

public class TestMap {
    public static void main(String[] args)
    {
        Object[] ob1=new Object[]{2,3,4};
        Object[] ob2=new Object[]{3,4,5};
        List ls1=new List(ob1);
        List ls2=new List(ob2);
        Map mp1=new Map(ls1,ls2);
        System.out.println(mp1.get(2));
        System.out.println(mp1.get(3));
        System.out.println(mp1.get(4));
        System.out.println();

        Map mp= new Map();
        mp.put(2,3);
        mp.put(3,4);
        mp.put(4,5);
        System.out.println(mp.get(2));
        System.out.println(mp.get(3));
        System.out.println(mp.get(4));
        System.out.println();

        mp.put(2,8);
        System.out.println(mp.get(2));
        System.out.println();

        System.out.println(mp.get(2,7));
        mp.put(2,null);
        System.out.println(mp.get(2,7));
        System.out.println();

        System.out.println(mp.remove(2));
        System.out.println(mp.get(2));
        System.out.println();

        System.out.println(mp.keyContains(2));
        System.out.println(mp.keyContains(3));
        System.out.println(mp.keyContains(4));
        System.out.println();

        System.out.println(mp.getKeys().get(0));
        System.out.println(mp.getKeys().get(1));
        System.out.println();

        System.out.println(mp.getValues().get(0));
        System.out.println(mp.getValues().get(1));
        System.out.println();

        Pair pr= (Pair)mp.getEntries().get(0);
        System.out.println(pr.key());
        System.out.println(pr.value());
        System.out.println();

        pr= (Pair)mp.getEntries().get(1);
        System.out.println(pr.key());
        System.out.println(pr.value());
        System.out.println();

        System.out.println(mp.size());
        System.out.println();

        System.out.println(mp.isEmpty());
        mp.remove(3);
        mp.remove(4);
        System.out.println(mp.isEmpty());


    }
}
