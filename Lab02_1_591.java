
// package lab02_1_620510591;
import java.util.Scanner;

public class Lab02_1_591 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input_ = new Scanner(System.in);
        System.out.print("Enter Alphabet :");
        char str = input_.nextLine().charAt(0);
        System.out.print("Enter Number :");
        int n = input_.nextInt();
        int number;
        number = find_range_num(n);
        
        /*รับinputแล้วเก็บไว้ที่ตัวแปร str แล้วเอามาเชคก่อนว่าใช่ a or b ไหมถ้าไม่ใช่ก็แสดงgoodbye เลย ที่ทำแบบนี้ก่อนเพราะว่าถ้าเอามาเชค ว่าเป็น a หรือ b แล้วแยก if กัน
พอจบif ด้านบนอันแรกแล้ว มันจะลงมาทำงานในส่วนของ else ด้านล่างต่อ อย่างตอนแรกเรากำหนกเชคif = 'a' ด้านบนถัดลงมาเป็น if ='b' แล้วก็ else ด้านล่างคู่กับของ b ซึ่ง display ที่ได้ออกมาคือ มันออก pattern ของaก็จริงแต่มันจะจบท้าย
        ด้วยข้อความ goodbye เสมอ เพราะว่า str != b ดังนั้นมันก็เลยเลื่อนลงมาทำงานในส่วนของ else ด้านล่างด้วย*/
        if (str == 'a'|| str == 'b') {
            //System.out.println("come in");
            //if you enter 'b'
            if (str == 'b'){
            printStar_B(number);
            
        }
            //if you enter 'a'
            else{
            printStar_A(number);
            }
        } 
        
       //if you enter without a or b
        else{
            System.out.println("Good Bye");
        }
    }
    public static int find_range_num(int number){
        //เป็นmethod สำหรับรับค่า ตัวเลขที่เราต้องการprint star
        Scanner new_ = new Scanner(System.in);
        
        /*หลักการทำงานก็คือ ถ้าตัวเลขที่รับ input เข้ามามีค่าอยู่ระหว่าง 1-10 ก็ให้return ค่ากลับไปที่ main
แต่ถ้าค่าที่รับ input เข้ามามีค่า น้อยกว่า2 หรือว่า มากกว่า 10 ก็สั่งให้ user inputค่าใหม่จนกว่าเขาจะinput ค่าที่อยู่ในช่วงที่ถูกต้อง*/
        if (number>=2 && number<= 10){
            return (number);
        }
        else{
            while (number < 2 || number > 10){
                System.out.print("Please Enter Number Between 2-10 :");
                
                number = new_.nextInt();
            }
            return (number);
        }
    }
    
    //if input string == A
    public static void printStar_A(int number){
        //System.out.println("come in to a");
        //System.out.println("number="+number);
        int row, col;
        //
        for(row=number;row>=1;row-- ){
            
            for(col=row;col >= 1;col--){//print * จากมากสุดไปน้อยสด ตาม จน row เช่น แถว=4 ก็*=4อัน 
                System.out.print('*');
                //System.out.println("eiei2");
            }
            System.out.println();//print ครบ 1 แถวแล้วสั่งขึ้น line ใหม่ แล้วก็วนกลับไปลดค่า row เรื่อยๆจนถึงแถวสุดท้าย
            
        }

        
        
        
    }
    
    //if input string == B
    public static void printStar_B(int number){
        //System.out.println("come in");
        int row, col, i;
        int less = number-1;//เอาไว้สำหรับดำเนินการกับช่องว่าง เพราะpattern  b จะมี print ช่องว่าควบคู่กับ print star ไปด้วย
        
        //หลักการคล้าย A แต่เราจะเริ่มจาก แถวที่มีค่า=1 วนไปจนถึงแถวสุดท้ายที่มีค่ามากสุด ดังนั้น * ก็จะ print จากน้อยไปมาก
        for(row=1; row<=number; row++){
            for(i=0; i<less; i++){
                //print ตาม จน less ที่เข้ามาอย่างสมมุติ number=4 มันก็จะพิมพ์ช่องว่างมา3แล้วหลังจากนั้นก็ พิมพ์ *มา1 แล้วก็ขึ้นline ใหม่พอขึ้นline ใหม่ก็พิมพ์ช่องว่ามา2แบบนี้ลดลงไปเรื่อยๆ
                
                System.out.print(' ');
            }
            
            for(col=1; col<=row; col++){
                //System.out.print(' '*less);
                System.out.print('*');
            }
            System.out.println();//next line
            less--;//ลดค่าless ไปเรื่อยๆ
        }
    }
    
}
