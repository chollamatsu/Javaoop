import java.util.Scanner;

public class Lab01_1_591 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;int b;int c;int la;
        Scanner first = new Scanner(System.in);
        System.out.print("Enter A :" );
        a = first.nextInt();
        System.out.print("Enter B : ");
        b = first.nextInt();
        System.out.print("Enter C : ");
        c = first.nextInt();
        
        /*
        //รีเชคว่า ค่าa,b,c ตรงกับที่เรา inputเข้ามาไหม
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        */
        //สั่งprint a,b ก่อน 
        System.out.print(a+" "+b);
        //ทำการหาค่าถัดไปก่อนที่จะเริ่มทำ while loop แล้วโจทย์บอกว่าค่าถัดไปมีค่าไม่เกิน c ดังนั้นเราก็ต้องหาค่าถัดไปก่อนแล้วค่อยเอาไปเชคกับ c 
        //ถ้า T ก็วนลูป แต่ถ้า F ก็ไม่ทำ
        la = (a*a)+(b*b);
        //System.out.println("last = "+la);//เชคเฉยๆว่า la ของเราหาได้เท่าไหร่
        
        while (la <= c){
            System.out.print(" "+la);//สั่งprint ตัวถัดไปต่อจาก ตัวก่อนหน้าเลย
            
            //assign ค่าให้a,b,la ใหม่ เพราะว่าจะต้องหาตัวถัดไป ซึ่งตัวถัดไปเกิดจาดตัวก่อนหน้าของมัน ยกกำลังสองแล้วบวกกัน ดันั้นเราเลยต้อง assign ค่าให้กับ parameter ใหม่
            a = b;
            b = la;
            la = (a*a)+(b*b);
            
        }
        
        
        
        
    }
    
}
