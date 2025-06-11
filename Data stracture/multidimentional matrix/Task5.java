// Task 05: Game Arena
class Task5{

    //Complete this method so that it gives the Expected Output
    public static void playGame( Integer[][] arena ){


    int row =arena.length;
    int col=arena[0].length;


    int c50=0;
    int c100=0;
    int c200=0;

    for (int i=0;i<col;i++){

    for(int j=0;j<row;j++){
    if (arena[j][i]==50){

if (i==0){

if (arena[j-1][i]==2){
c50+=1;
}
if(arena[j+1][i]==2){
c50+=1;
}
if(arena[j][i+1]==2){
c50+=1;
}
}

else{
    if (arena[j-1][i]==2){
    c50+=1;
    }
    if(arena[j+1][i]==2){
        c50+=1;
    }
    if(arena[j][i+1]==2){
        c50+=1;
    }
    if (arena[j][i-1]==2){
    c50+=1;
    }


    }

    }

else if (arena[j][i]==100){

if (i==col-1){
    if (arena[j-1][i]==2){
        c100+=1;
    }
    if(arena[j+1][i]==2){
        c100+=1;
    }
    if (arena[j][i-1]==2){
        c100+=1;
    }
}
else if (j==row-1){

    if (arena[j-1][i]==2){
        c100+=1;
    }
    if(arena[j][i+1]==2){
        c100+=1;
    }
    if (arena[j][i-1]==2){
        c100+=1;
    }
}
else {
    if (arena[j-1][i]==2){
        c100+=1;
    }
    if(arena[j+1][i]==2){
        c100+=1;
    }
    if(arena[j][i+1]==2){
        c100+=1;
    }
    if (arena[j][i-1]==2){
        c100+=1;
    }
}

    }
    else if (arena[j][i]==200){

        if (i==col-1){
            if (arena[j-1][i]==2){
                c200+=1;
            }
            if(arena[j+1][i]==2){
                c200+=1;
            }
            if (arena[j][i-1]==2){
                c200+=1;
            }
        }
        if (j==row-1){

            if (arena[j-1][i]==2){
                c200+=1;
            }
            if(arena[j][i+1]==2){
                c200+=1;
            }
            if (arena[j][i-1]==2){
                c200+=1;
            }
        }
        else {
            if (arena[j-1][i]==2){
                c200+=1;
            }
            if(arena[j+1][i]==2){
                c200+=1;
            }
            if(arena[j][i+1]==2){
                c200+=1;
            }
            if (arena[j][i-1]==2){
                c200+=1;
            }
        }

    }
    }
    }
    int x=(c50+c100+c200)*2;
    if (x>=10){
    System.out.print("points gained:" +x+".Your team has survived the game.");
    }
    else{
    System.out.print("Points Gained:"+ x+". Your team is out.");
    }
    }



    public static void main(String[] args){
        Integer[][] arena = {
                {0,2,2,0},
                {50,1,2,0},
                {2,2,2,0},
                {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");

        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
                {0,2,2,0,2},
                {1,50,2,1,100},
                {2,2,2,0,2},
                {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");

        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}
