import java.util.*;

public class SampleWork2 {
    public static void main(String[] args) {
        System.out.println("Choose between 1 2 3");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        int b = sc.nextInt ();
        if (a==b){
            System.out.println("Number is same");
        }else if (a>b) {
                System.out.println("a is greater than b");
            } 
            else{
                System.out.println("a is less than b");
            }

        
    }

}
