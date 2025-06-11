// Complete the sumOfLeaves method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        //TO DO

        if (root== null){
        return 0;
        }
        return msumhelper(root.left ,root.right);
        // remove this line
    }
    public static int msumhelper(BSTNode left,BSTNode right){

    if (left==null || right==null){


    return 0;
    }
    int sum= (int)left.elem +right.elem;

    sum+=msumhelper(left.left,right.right);
    sum+=msumhelper(left.right,right.left);

    return sum;
    //===============================================================


}
}
