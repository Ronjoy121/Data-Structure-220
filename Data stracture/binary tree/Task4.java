// Complete the swapChild method
public class Task4 {

    //===================================TASK#4===================================
    // This method takes only 3 parameters
    // 1st one is root of the given tree
    // 2nd one is there to help you count the levels
    // 3rd one is the level TILL whic you need to swap childs
    // All the changes will happen in-place
    // This method doesn't return anything
    // You can use extra helper private static methods as per need


        public static void swapChild(BTNode root, int Lvl, int M) {
            swapHelper(root,  Lvl, M);
        }

        private static void swapHelper(BTNode node, int level, int M) {
            if (node == null){
            return;
            }

            if (level !=M) {
                BTNode temp = node.left;
                node.left = node.right;
                node.right = temp;
            }


            swapHelper(node.left, level + 1, M);
            swapHelper(node.right, level + 1, M);
        }
    }
    //============================================================================


