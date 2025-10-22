public class _01linkedList
{
    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    public static class linkedlist
    {
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val)
        {
            Node temp=new Node(val);
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else
            {
                tail.next=temp;
                tail=temp;
            }


        }

        void display()
        {
            Node temp=head;
            System.out.print("The elements in the Linked list are:");
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }

        }

        int size()
        {
            Node temp=head;
            int count=0;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }

        void insertAtHead(int val)
        {
            Node temp=new Node(val);
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else
            {
                temp.next=head;
                head=temp;
            }
        }

        void insertAtAnyPosition(int index,int val)
        {
            Node newNode=new Node(val);
            Node temp=head;

            if(index==0)
            {
                insertAtHead(val);
                return;
            }
            else if(index==size())
            {
                insertAtEnd(val);
                return;
            }

            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }

        int getElement(int index)
        {
            Node temp=head;
            for(int i=1;i<=index;i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }

        void delete(int index)
        {
            Node temp=head;
            if(index==0)
            {
                head=head.next;
                return;
            }
            
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
               
            }
            if(temp.next==tail)
            {
               tail=temp;
            }
            
            temp.next=temp.next.next;
            
            
        }
    }

    public static void main(String[] args)
    {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(43);
        ll.display();
        System.out.println("\nThe length of the Linked list is:"+ll.size());
        ll.insertAtHead(55);
        ll.display();
        System.out.println("\nThe length of the Linked list is:"+ll.size());
        ll.insertAtAnyPosition(2, 12);
        ll.display();
        System.out.println("\nThe length of the Linked list is:"+ll.size());
        ll.insertAtAnyPosition(0, 15);
        ll.display();
        System.out.println("\nThe length of the Linked list is:"+ll.size());
        ll.insertAtAnyPosition(6, 152);
        System.out.println("\nThe length of the Linked list is:"+ll.size());
        ll.display();
        int element=ll.getElement(0);
        System.out.println("\nThe element is: "+element);
        ll.delete(3);
        ll.display();
        System.out.println(ll.tail.data);

    }
}