//Task 02: Decryption Process
class Task2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){
    Integer[] arr=new Integer[2];

    int sum1=0;
    int sum2=0;
     int row =matrix.length;
     int col =matrix[0].length;
     Integer[]arr2=new Integer [col];
     Integer[]arr3=new Integer[2];


    for (int i=0;i<col;i++){
        int sum=0;

    for (int j=0;j<row;j++){

    sum=sum+matrix[j][i];
    }

    arr2[i]=sum;

    }
    arr3[0]=arr2[1]-arr2[0];

    arr3[1]=arr2[2]-arr2[1];

    return arr3;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
                {1,3,1},
                {6,4,2},
                {5,1,7},
                {9,3,3},
                {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}