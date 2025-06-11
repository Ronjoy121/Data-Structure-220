public class Task2 {

    public static Node wordDecoder( Node head ){

    Node dhead=new Node(null,null);

    Node dtemp=dhead;

    Node temp=head;


    int len=0;


    while (temp!=null){
    len=len+1;
    temp=temp.next;
    }

    int x=13%len;


    for (int i=len-1;i>0;i--){
    if(i%x==0){
        int c=0;
        Node tempa=head;

    while(tempa!=null){

    if (c==i){
      Node n=tempa;
        Node nNode=new Node(n.elem);
        dtemp.next=nNode;
        dtemp=nNode;

        break;
    }
    c++;
    tempa=tempa.next;
    }


    }
    }





return dhead;

        //You're suppose to create a new Dummy headed Singly Linked List in this method
        //Dummy head is basically a head Node where the elem is null
        // Node dHead = new Node(null, null); here the dHead is a Dummy Head

        //TO DO

        //remove the following line when you're ready to return the new head
}      //return null;



    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}

