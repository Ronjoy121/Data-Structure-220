public class Task5 {
    public static int sumDist(Node head, Integer[] distArr) {
    int len=0;
    int sum=0;
    Node temp=head;
    while(temp!=null){
    len+=1;
    temp=temp.next;
    }


    for(int i=0;i<distArr.length;i++){
    int x= distArr[i];
    Node temp1=head;

    if (distArr[i]>=len){
    sum+=0;
    }
    else{
    int count=-1;

    while(temp1!=null){
    count+=1;
    if (count==distArr[i]){
    sum+=(int)temp1.elem;
    break;
    }
    else{
    temp1=temp1.next;
    }
    }

    }
    }

    return sum; // Remove this line.

    }


    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
        System.out.print("Given LinkedList: ");
        LinkedList.printLL(head1);
        System.out.print("Distance Array: ");
        Arr.print(dist);
        System.out.println("\nExpected Output: 4");
        int returnedValue = Task5.sumDist(head1, dist);
        System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
