import java.util.Scanner;

public class TotalInColum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row= scanner.nextInt();
        System.out.print("Enter the column: ");
        int column= scanner.nextInt();
        int[][] array= new int[row][column];
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array[i].length;j++){
                array[i][j]= (int)(Math.random()*100);
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        int total=0;
        System.out.print("Enter the column you want to sum : ");
        int totalrow= scanner.nextInt();
        for(int i=0; i< array.length; i++){
            total+=array[i][totalrow-1];
            for(int j=0; j< array[i].length; j++){

            }
        }
        System.out.println("The total number of elements of the coth "+totalrow+" is : "+total);
    }
}
