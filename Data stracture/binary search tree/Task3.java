// Complete the sumOfLeaves method
public class Task3 {

    //===================================TASK#3======================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is the sum initiliazed as 0
    // You'll need to return the sum of the leaf nodes
    public static Integer sumOfLeaves( BSTNode root, Integer sum ){
       return helpsumofleaves(  root );
    }

    public static int helpsumofleaves(BSTNode node ){
        // TO DO
        //remove this line

        if (node ==null){
        return 0;
        }
        int sum1=0;
        if (node.left ==null && node.right==null){
        sum1=(int) node.elem;
        }
        sum1+=helpsumofleaves ( node.left   );
        sum1+=helpsumofleaves ( node.right  );

        return sum1;
    }
    //===============================================================

}

