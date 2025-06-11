// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){

        if (root == null){
        return "No Path Found";
        }
        String path = "";
        BSTNode node = root;

        while (node != null) {
            path += node.elem + " ";

            if (node.elem == key) {
                return path;
            }
            else if (key < node.elem) {
                node= node.left;
            } else {
                node = node.right;
            }
        }

        return "No Path Found";
    }
}

