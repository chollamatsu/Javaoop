// package lab01_4_591;
import java.util.Scanner ;
import java.util.ArrayList;

public class Lab01_4_591 {
    /**
     * @param args the command line arguments
     */
    //@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //ประกาศ  array list มา3ตัว list_a = ลิสที่จะเอามาเปรียบเทียบอันแรก,list_b = ลิสที่จะเอามาเปรียบเทียบอันสอง,list_c = ลิสที่ได้จากการเอาa,bมาเทียบกัน
        ArrayList<Integer> list_a = new ArrayList<>();
        ArrayList<Integer> list_b = new ArrayList<>();
        ArrayList<Integer> list_c = new ArrayList<>();
        Scanner sn = new Scanner(System.in);
        //int a_ = sn_a.nextInt();
        
        
        System.out.println("Enter Array A :");
        
        //โจทย์สั่งให้เป็นarray[5]
        
        for (int i = 0;i<5;i++){
            int a_ = sn.nextInt();//รับinput ไปเก็บไว้ในa
            list_a.add(a_);//แล้วนำค่าbที่รับเข้ามา เอาไปเก็บไว้ใน array a
            //System.out.println("A = "+ list_a);//สั่งดูค่าที่เข้ามาในarray_aเฉยๆ
            
        }
        System.out.println("EnterArray B :");
        for (int i = 0;i<5;i++){
            int b_ = sn.nextInt();//รับinput ไปเก็บไว้ในb
            list_b.add(b_);//แล้วนำค่าbที่รับเข้ามา เอาไปเก็บไว้ใน array b
            //System.out.println("B = "+list_b);//สั่งดูค่าที่เข้ามาในarray_bเฉยๆ
            
        }
        //System.out.println("length :"+a.size());//ขอเชคไซส์เฉยๆไม่เกี่ยวกับส่วนของprocess
        
        
        //System.out.println("list c :"+list_c);
        
        /*หลักการทำงานก็คือ
           เราจะดึงelementแรกขแงลิสแต่ละตัวมาเทียบกัน>ถ้าตัวไหนมากกว่าก็เก็บลงลิสใหม่>แล้วเราก็ลบelementที่ได้เก็บลงลิสใหม่นั้นทิ้งไป(ไปลบที่ลิสเก่า)
        >แล้วก็ทำแบบนี้ซ้ำกันไปจนมีลิสใดลิสนึงมีสมาชิกเป็น0ก็คือโดนเอาไปเก็บในลิสใหม่จนหมดแล้ว ก็ออกลูปการทำงาน
        คือตอนที่เราลบelement index 0 ออกไป ก็จะทำให้ index ของ element ที่เหลือเปลี่ยนไป ก็คือพอ index 0 is out then index 1 moves or replace to index 0
        */
        while (list_a.size() > 0 & 0 < list_b.size()){
        
            if (list_a.get(0) > list_b.get(0)){
                list_c.add(list_a.get(0));
                list_a.remove(0);
                //System.out.println("list c :"+list_c);
                
            }
            else{
                list_c.add(list_b.get(0));
                list_b.remove(0);
                
                
            }
        }

        //ถ้ามี element ลิส a หรือ b หมดก่อนแล้วอีกลิสยังเหลือจำนวนelement อยู่
        //หลักการทำงานใน while loop เหมือนกันเลย 
        //ที่ต้องใช้ loop ในการเข้าถึง array แต่ละตัวก็เพราะว่า เราเก็บarray list_a or list_b into array list_c ไม่ได้เพราะมันถูกมองเป็น obj คนละdata type กัน 
        //ต้องเป็น int ถึงจะเก็บได้ ดังนั้นเราก็เลยต้องทำการเข้าถึงข้อมูลอีกรอบเพื่อที่จะได้เก็บ ข้อมูลของลิสที่เหลือลงลิสใหม่
        if (list_b.isEmpty()){
            while (!list_a.isEmpty() ){
                list_c.add(list_a.get(0));
                list_a.remove(0);//ทำการลบelement ที่อยู่ในลิสเหมือนเดิม ไม่งั้นมันจะไม่ออกการทำงาน
                
            }
        } 
        else{
            while (!list_b.isEmpty()){
                list_c.add(list_b.get(0));
                list_b.remove(0);//ทำการลบelement ที่อยู่ในลิสเหมือนเดิม ไม่งั้นมันจะไม่ออกการทำงาน
            }
        }
        System.out.println("List_c = "+list_c);
        
       
            
        
        
            
            
        
        
        
        
        
    }

    
    
}
