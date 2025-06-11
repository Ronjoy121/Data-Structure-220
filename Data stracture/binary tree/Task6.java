// Complete the levelSum method
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){

                return calculate(root, 1);
            }

            private static int calculate(BTNode node, int level) {
                if (node == null) return 0;

                int sum =(int)node.elem;
                if (level % 2 != 0) {
                    sum = -sum;
                }

                sum += calculate(node.left, level + 1);
                sum += calculate(node.right, level + 1);

                return sum;
            }
        }

    //============================================================================


