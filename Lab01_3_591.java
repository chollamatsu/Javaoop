//package lab01_3_591;
import java.util.Scanner;

public class Lab01_3_591 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();//To barter cans
        int b = a;//To count the total number of cans drank
        
        // We need to drink up to 5 cans before we can barter them. That is, if you drink 4 cans left like this, you can't exchange them anymore.
        //ดังนั้นก็ดำเนินการเข้าลูปเอาไปแลกไม่ได้แล้วเพราะมีไม่ครบ 5 กระป๋อง
        while (a > 5){
            b+=2;//Out of 5 cans -> can be barter for 2 cans -> so from all bought -> add 2 more It means that you need to drink 2 more cans.
            a = a-5;//drank 5 cans
            a = a+2;//Take it to barter then got two more cans.
            //System.out.println("total number of cans drank = "+b);
            //System.out.println("remaining cans ="+a);
            //System.out.println("----------------------");
        }
        //System.out.println("---------summary-------------");
        //System.out.println("total number of cans drank = "+b);
            //System.out.println("remaining cans ="+a);
        System.out.println("Total Number of Drinking bottles = "+b+" The remainning empty bottles = "+a);
    }
    
}
