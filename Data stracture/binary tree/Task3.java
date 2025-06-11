// Complete the sumTree method
public class Task3 {

    //===================================TASK#3===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods as per need
    public static Integer sumTree( BTNode root ){
         return sumHelper(root, 0);

    }

                // Check if node is a leaf
                private static int sumHelper(BTNode node, int level) {
                    if (node == null){
                    return 0;
                    }
                    int sum;
                    if (level == 0) {
                        sum = (int)node.elem;
                    } else {
                        sum = (int)node.elem % level;
                    }

                    sum +=sumHelper(node.left, level + 1);
                    sum += sumHelper(node.right, level + 1);

                    return sum;
                }
            }



    //============================================================================



