import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        String countString = "abcdef";
        int count= 0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the characters ");
        String kyTu = scanner.nextLine();
        for(int i=0;i<countString.length();i++){
            char ch= countString.charAt(i);
            String a= String.valueOf(ch);
            if(kyTu.equals(a)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
