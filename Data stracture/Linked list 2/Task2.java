public class Task2 {//Complete this method so that it gives the Expected Output
    public static void mostWater( Integer[] height ){
    int x=height.length;
    int max =0;
    int a=0;
    int min=0;
int len=0;

    for (int i=0;i<height.length-1;i++){
    len=0;

    for (int j=i+1;j<height.length;j++){
    len+=1;

    if (height[i]<=height[j]){
    a=(height[i]*len);
    }
    else if(height[j]<=height[i]){
    a=(height[j]*len);
    }

    if (a>max){
    max=a;
    }
    else{
    min=a;
    }

    }

    }


System.out.print(max);










    }


        //TO DO



    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
        System.out.print("\nYour Output:\n");
        mostWater( array );

    }

}
