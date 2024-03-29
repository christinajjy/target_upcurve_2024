import java.util.Scanner;
import java.util.ArrayList;

public class Assignment1 {
    public static void main(String args[]){
        ArrayList<String> starr = new ArrayList<>();
        ArrayList<Integer> narr = new ArrayList<>();
        int nc=0,stc=0,nsum=0;
        Scanner sc = new Scanner(System.in);
        while(true){
            String s;
            s =sc.nextLine();
            try{
                int n = Integer.parseInt(s);
                nc++;
                nsum+=n;
                narr.add(n);
            }

            catch(Exception e){
                starr.add(s);
                stc++;
            }


            if(s.equalsIgnoreCase("no")){
                stc--;
                break;
            }
        }
        System.out.println("Number of inputs:"+(nc+stc));
        System.out.println("Number of integer inputs:"+nc);
        System.out.println("Number of non-integer inputs:"+stc);
        System.out.println("Sum of all integer inputs:"+nsum);
        System.out.print("The integer inputs: ");
        for (int curr : narr) {
            System.out.print(curr+" ");
        }
        System.out.print("\nThe non-integer inputs: ");
        for (String curr : starr) {
            System.out.print(curr+", ");
        }
    }
}
