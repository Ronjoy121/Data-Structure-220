// Complete the subtractSummation method
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation( BTNode root ){


               if (root == null){
               return 0;
               }
                int leftSum = sum(root.left);
                int rightSum = sum(root.right);
                return  leftSum - rightSum;
           }

           private static int sum(BTNode node) {
               if (node == null){
                return 0;
               }
               int sum=(int)node.elem ;
               sum+=(int)sum(node.left);
               sum+=(int)sum(node.right);
               return sum; //(int)node.elem + sum(node.left) + sum(node.right);
            }
        }


    //============================================================================


