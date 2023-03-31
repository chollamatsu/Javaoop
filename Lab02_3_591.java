// package lab02_3_591;
import java.util.Scanner;
//import java.util.math;

public class Lab02_3_591 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input_ = new Scanner(System.in);
        int number;
        //กำหนดตัวแปรที่เอาไว้รับค่าจากmethod เป็นbool
        boolean check_even,check_prime;
        
        System.out.print("Enter number : ");
        number = input_.nextInt();
        //ส่งค่าเข้าไปทำงานที่method >>check odd and even and method check prime 
        check_even = checkOddEvent(number);
        check_prime = checkPrime(number);
        
        //display 
        
        //ถ้าค่าที่ส่งมาจาก checkoddevent method เป็นจริงซึ่งเรากำหนดให้ว่าถ้าเป็นเลขคู่จะคืนค่าเป็นจริง
        if (check_even == true){
            System.out.println(number+" is even number");
        }
        //ถ้าคืนค่า false ก็จะเป็นเลขคี่
        else{
            System.out.println(number+" is odd number");
            
        }
        //ถ้าค่าที่ส่งคืนมาจาก checkprime method เป็น true แปลว่าค่านั้นเป็น prime เพราะเรากำหนดให้ คืนค่า true เมื่อค่านั้นเป็น prime
        if (check_prime == true){
            System.out.println(number+" is prime number");
        }
        else{
            System.out.println(number+" is not prime number");
        }
        
        
        
    }
    
    public static boolean checkOddEvent(int number){
        return number%2==0;
        /*
        //การทำงานข้างล่างนี้เหมือนกับด้านบน เพียงแต่ด้านบนเป็นแบบย่อเพราะhint เปลี่ยนให้
        if (number%2==0){
            return true;
        }
        else {
            return false;
        }
*/
    }
    public static boolean checkPrime(int number){
        int limit = (int)(Math.sqrt(number))+1;//คือตัวประกอบ2ตัวที่คูณอันอ่ะ ถ้าถอดรูทมามันจะได้ค่าๆนึงออกมาใช่ไหม(รวมกัน1ไปด้วย)ซึ่งค่าที่ได้อ่ะมันคือค่าที่มากที่สุด(ของเลขคู่อันดับตัวน้อยอ่ะ)
        //เพราะว่าพอถึงค่าๆนึงที่มากที่สุดที่มันหารไม่ได้แล้วหารไม่ลงตัวแล้วดังนั้นตัวเลขต่อไปที่มากกว่าค่าlimit ก็จะหารต่อไปไม่ได้แล้วเพราะขนาดเลขก่อนหน้าก็ยังหารไม่ลงตัวเลยดังนั้นเลขถัดไปที่มากกว่าก็หารไม่ได้แน่ๆ
        //ดังนั้นเราก็เลยต้องหาค่าlimitมันออกมา
        //มันจะมีค่าน้อยกว่าค่ารูทnumber คือค่าี่มากที่สุดที่เราสามารถเอามันมาหารได้ ดังนั้นเราก็เลยต้องหาค่ามากที่สุดอันนี้มาก่อน หรือง่ายๆก็คือ limit ที่สามารถหาได้
        //ส่วน +1 ก็คือมาจาก กรณีที่เราถอดรากออกมาแล้วมีค่าเป็นทศนิยมที่มีค่าใกล้เคียงกับเลขจำนวนเต็ม เช่น รูท(99)=9.9..ซึ่งมันใกล้เคีงกับ10ดังนั้นเราก็บวก1เข้าไปแล้วตัดทศนิยมออกไปซะแบบนี้ก็ได้
        //แนวคิดมาจาก clique cula ep.68 
        //อย่างเช่น รูป(17)ถอดมาน่าจะประมาณ4กว่าๆ+1 = 5 ก็วนตัวหารตั้งแต่ 2 ถึง 5 ว่าหารลงตัวไหม สรุปคือไม่ดังั้น17ก็เป็น prime ถึง 5 เพราะว่า 5^2=25 ;17<25 ดังนั้นตัวที่มากกว่า5ก็หารไม่ลงตัวเหมือนกันก็ไม่ต้องคิดแล้ว
        //รูท(16)=4>>+1=5 ตัวที่หาร16 ลงตัววนตั้งแต่2ถึง5 สรุปมี 2,4 ที่หารลงตัว(คู่อันดับกัน 2*4=4*2) lส่วน5 หารไม่ลงตัวแล้ว แล้ว 5^2=25;16<25 ดังนั้น มากกว่า5 ก็หา16ๅม่ลงตัวเหมือนกันกับ 5
        int i;//กำหนดให้ป็นตัวส่วนเอาไว้ดำเนินการ mod number
        if (number == 1 ){
            //1 is not prime that makesense .
            return false;
        }
        for (i=2;i<=limit;i++){
            //หาตัวส่วนจาก2ไปจนถึงรากที่2ของnumberหรือจำนวนที่เราต้องการหา
            if (number%i==0 && number != i){
                //number % i = 0 ถ้าหารลงตัวก็แสดงว่าไม่ใช่ prime เพราะว่า prime คือไม่มีตัวไหนที่หารตัวมันลงตัวเลย ยกเว้น 1 กับ ตัวมันเอง
                //number != i ก็คือ number ก็ต้องไม่เท่ากับตัวมันเองด้วยเพราะ prime คือมี 1 กับ ตัวมันเองเท่านั้นที่หารมันลงตัว
                //แสดงว่าถ้าเข้า เงื่อนไขนี้ก็ไม่ใช่ prime แล้วแหละ
                return false;
            }
        }
        return true;
        
        
        
    }
    
}
