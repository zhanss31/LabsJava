package labs2;

public class List<T> {

    public static class Node {
        public int value;
        public List.Node next;
        public Node ()
        {
            this.value= 0;
            this.next= null;
        }
        public Node(int value)
        {
            this.value=value;
            this.next= null;
        }
        public Node(int value, List.Node next)
        {
            this.value=value;
            this.next= next;
        }
        public Node( List.Node node)
        {
            this.value=  node.value;
            this.next= node.next;
        }
    }

    private Node head;

    public List()
    {
        this.head=null;
    }

    public List(Node head)
    {
        this.head=head;
    }

    public void add(int value)
    {
        if(this.head!=null)
        {
            Node node = this.head;
            while(node.next!=null)
                node=node.next;
            node.next = new Node(value);
        }
        else
        {
            this.head= new Node(value);
        }

    }

    public Node getHead()
    {
        return this.head;
    }

    public static Node merge(Node head1, Node head2)
    {
        Node node1= head1;
        Node node2= head2;
        Node head3= new Node();
        Node head4=head3;

        if(node1.value>=node2.value)
        {
            head3.value=node2.value;
            node2= node2.next;
        }
        else
        {
            head3.value=node1.value;
            node1= node1.next;

        }

        while(node1!=null || node2!=null)
        {
            if(node1== null)
            {
                head3.next= new Node(node2.value);
                head3=head3.next;
                node2= node2.next;
            }
            if(node2==null)
            {
                head3.next= new Node(node1.value);
                head3=head3.next;
                node1=node1.next;
            }
            if(node1!=null && node2!=null)
            {
                if(node1.value>=node2.value)
                {
                    head3.next= new Node(node2.value);
                    head3=head3.next;
                    node2= node2.next;
                }
                else
                {
                    head3.next= new Node(node1.value);
                    head3=head3.next;
                    node1= node1.next;

                }
            }
        }
        return head4;
    }


}
