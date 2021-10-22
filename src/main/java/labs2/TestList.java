package labs2;

public class TestList {
    public static void main( String[] args)
    {
        List ls= new List();
        int[]arr= new int[5];
        arr[0]=1;
        arr[1]=3;
        arr[2]=5;
        arr[3]=9;
        arr[4]=10;
        System.out.println("Первый лист");
        for(int i=0;i<arr.length;i++)
        {
            ls.add(arr[i]);
        }
        List.Node head= ls.getHead();
        while(head!=null)
        {
            System.out.println(head.value);
            head=head.next;
        }
        System.out.println();


        List ls1= new List();
        int[]arr1= new int[4];
        arr1[0]=2;
        arr1[1]=4;
        arr1[2]=6;
        arr1[3]=8;
        System.out.println("Второй лист");
        for(int i=0;i<arr1.length;i++)
        {
            ls1.add(arr1[i]);
        }
        List.Node head1= ls1.getHead();
        while(head1!=null)
        {
            System.out.println(head1.value);
            head1=head1.next;
        }


        System.out.println();
        List.Node head3= ls.merge(ls.getHead(), ls1.getHead());
        System.out.println("Cлияние листов");
        while(head3!=null)
        {
            System.out.println(head3.value);
            head3=head3.next;
        }

    }
}
