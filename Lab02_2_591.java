// package lab02_2_591;

import java.util.Scanner;

public class Lab02_2_591 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input_ = new Scanner(System.in);
        System.out.print("Enter N :");
        int n = input_.nextInt();
        int i,x,y;
        String quadrant;
        int origin=0;
        int xaxis=0;
        int yaxis=0;
        int q1= 0;
        int q2=0;
        int q3=0;
        int q4=0;
        
        for (i=1;i<=n;i++){
            
            //วนรับคู่อันดับx,y ตามจำนวน n ที่รับมา
            System.out.print("Enter point :");
            x = input_.nextInt();
            System.out.print("Enter point :");
            y = input_.nextInt();
            System.out.println();
            //รับค่าinput เสร็จเรียบร้อยแล้ว ส่งค่าเข้าไปทำงานในcheck quadrant method
            quadrant = checkQuadrant(x,y);
            
            //check a number in each quadrant
            if (quadrant == "origin" ){
                origin++;
            }
            if (quadrant == "xaxis" ){
                xaxis++;
            }
            if (quadrant == "yaxis" ){
                yaxis++;
            }
            if (quadrant == "q1" ){
                q1++;
            }
            if (quadrant == "q2"){
                q2++;
            }
            if (quadrant == "q3" ){
                q3++;
            }
            if (quadrant == "q4" ){
                q4++;
            }
        }
        
        //display
        System.out.println("Numberof points in Qaudrant 1 = "+q1);
        System.out.println("Numberof points in Qaudrant 2 = "+q2);
        System.out.println("Numberof points in Qaudrant 3 = "+q3);
        System.out.println("Numberof points in Qaudrant 4 = "+q4);
        System.out.println("Number of points on X axis = "+xaxis);
        System.out.println("Number of points on Y axis = "+yaxis);
        System.out.println("Number of points on origin point = "+origin);
        
        
       
    }
    public static String checkQuadrant(int x,int y){
        
        String quadrant = null;
        int number_of_quadrant;
        
        //เชคตามเงื่อนไขของแต่ละ quadrant เลย
        if (x==0 && y == 0){
            quadrant = "origin";
            }
        if (x == 0 && y != 0 ){
            quadrant = "xaxis";
        }
        if ( x != 0 && y == 0){
            quadrant = "yaxis";
        }
        if (x > 0 && y > 0){
            quadrant = "q1";
        }
        if (x < 0 && y > 0){
            quadrant = "q2";
        }
        if (x < 0 && y < 0){
            quadrant = "q3";
        }
        if (x > 0 && y < 0){
            quadrant = "q4";
        }
        
        //ถ้าตรงกับ quadrant ไหนหรือว่าอยู่บนquadrant ไหน ก็คืนค่าตำแหน่งออกมาเลย
        return quadrant;
        
        
        
        
        
        
    }
    
}
