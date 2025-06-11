public class Task3 {
    public static Node idGenerator(Node head1, Node head2, Node head3) {

    Node temp=head1;
    Node temp1=head2;
    Node temp2=head3;
    Node head4=null;

    while (temp!=null){
    Node nNode =new Node(temp.elem);
    nNode.next=head4;
    head4=nNode;
    temp=temp.next;
    }

while(temp1!=null& temp2!=null){
int x=(int)temp1.elem+(int)temp2.elem;
Node temp5=head4;
if (x<10){
Node NNode=new Node(x);
while(temp5.next!=null){
temp5=temp5.next;
}
temp5.next=NNode;
}
else if (x>=10){
int y=x%10;
Node nnode=new Node(y);
while(temp5.next!=null){
temp5=temp5.next;
}
temp5.next=nnode;
}
temp1=temp1.next;
temp2=temp2.next;
}

        //TO DO
        //Hint: the Node elements are actually Object, you can type cast them
        //      into int or Integer like the following:
        //        (int)n.elem  or  (Integer)n.elem

        return head4; // Remove this when you're ready to return the new head
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{0, 3, 2, 2});
        Node head2 = LinkedList.createList(new Integer[]{5, 2, 2, 1});
        Node head3 = LinkedList.createList(new Integer[]{4, 3, 2, 1});

        System.out.print("LinkedList#1:  ");
        LinkedList.printLL(head1); // This should print 0 -> 3 -> 2 -> 2

        System.out.print("LinkedList#2:  ");
        LinkedList.printLL(head2); // This should print 5 -> 2 -> 2 -> 1

        System.out.print("LinkedList#3:  ");
        LinkedList.printLL(head3); // This should print 4 -> 3 -> 2 -> 1

        Node result = Task3.idGenerator(head1, head2, head3);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result); // This should print 2 -> 2 -> 3 -> 0 -> 9 -> 5 -> 4 -> 2

        System.out.println("\n=========Test Case 2=============");
        Node head4 = LinkedList.createList(new Integer[]{0, 3, 9, 1});
        Node head5 = LinkedList.createList(new Integer[]{3, 6, 5, 7});
        Node head6 = LinkedList.createList(new Integer[]{2, 4, 3, 8});

        System.out.print("LinkedList#4:  ");
        LinkedList.printLL(head4); // This should print 0 -> 3 -> 9 -> 1

        System.out.print("LinkedList#5:  ");
        LinkedList.printLL(head5); // This should print 3 -> 6 -> 5 -> 7

        System.out.print("LinkedList#6:  ");
        LinkedList.printLL(head6); // This should print 2 -> 4 -> 3 -> 8

        Node result2 = Task3.idGenerator(head4, head5, head6);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result2); // This should print 1 -> 9 -> 3 -> 0 -> 5 -> 0 -> 8 -> 5
    }
}

