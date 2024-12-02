public class findingNoOf7 {
    public static void search(int arr[][]){

        int count = 0;

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.print("No of 7`s in this matrix is: "+count);
    }
    public static void sum(int arr[][]){
        int sum=0;
        int secondRow[]=arr[1];
        for(int i=0;i<secondRow.length;i++ ){
            sum+=secondRow[i];
        }
        System.out.print("Sum of all elements of second row is: "+sum);
    }

    public static void transpose(int arr[][]){
        int row=3,col=3;
        int transpose[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=arr[i][j];
            }
        }

       for(int i=0;i<transpose.length;i++){
           for(int j=0;j<transpose[i].length;j++){
               System.out

           }
       }
    }
    public static void main(String[] args){
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        search(arr);
        System.out.println();
        sum(arr);
        transpose(arr);



    }
}
