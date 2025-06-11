// Task 03: Row Rotation Policy of BRACU Classroom
class Task3{

    //Complete this method so that it gives the Expected Output
    public static Integer rowRotation( Integer examWeek, String[][] matrix ){
    int row=matrix.length;
    int col = matrix[0].length;


    for (int i=0;i<examWeek-1;i++){

    for (int j=0;j<col;j++){
        String h=matrix[row-1][j];
        String x=matrix[0][j];
    for (int a=1;a<row;a++){


    String k=matrix[a][j];
    ///String p= matrix[a+1][j];

matrix[a][j]=x;
x=k;
    }
    matrix[0][j]=x;
    }
    }
        Arr. print2D(matrix) ;
        int k=0;
    for (int q=0;q<row;q++){
    for (int p=0;p<col;p++){
    if (matrix[q][p].equals("AA")){
    k=q+1;

    }
    }
    }
    return k;

}
        //For this task you don"t need to create new arrays
        //After rotation the Matrix should be printed inside the method


      //Only the integer row number is to be returned



        //T


    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);

        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");

        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}