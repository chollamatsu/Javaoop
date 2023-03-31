import java.util.Scanner ;
import java.util.ArrayList;
import java.util.Collections;

public class Lab01_2_591 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int _sum = 0;int min_;int max_;int mid;int data;int i = 0;int mean_;
        ArrayList<Integer> below = new ArrayList<>();
        int less = 0;
        
        Scanner score = new Scanner(System.in);
        System.out.println("Enter Score between 1-100 or press 0 for Stop");
        
        //enter input then go to check with the loop
        data = score.nextInt();
        max_ = data;//Assign the first input to max as the first value to compare to the next.
        min_ = data;//Assign the first input to min as the first value to compare to the next.
        
        //The problem say: press 0 for stop -> reason why 0 is the condition to stop.
        while (data != 0 ){
            //The problem say more: The input number less than 100 -> Add couple conditions 1).input number > 100 then input again 2).input number < 100 then go to next step
            if (data <= 100){
                System.out.println("Score = "+ data);
                _sum = _sum + data;//sum to find mean.
                below.add(data);//Store in array to find value which less than mean.
                i++;//สำหรับนับจำนวนที่เราได้input(แบบถูกต้องไม่เกิน100) มาทั้งหมด สำหรับนำไปเป็นตัวส่วนหา mean
                
                //Compare value between current max & each input number to find real max.
                if (data > max_){
                    max_ = data;
                }
                //Compare value between current min & each input number to find real min.
                if (data < min_){
                    min_ = data;
                }
                
                //input score
                data = score.nextInt();
                
        }
            else{
                System.out.println("Enter Score Again between 1-100 or press 0 for Stop ");
                data = score.nextInt();
            }
            
            
            
        }
        
        //out of while loop
        mean_ = _sum/i;
        //Find value that is less than 100.
        Collections.sort(below);
        int index = 0;
        while (below.get(index) < mean_){
            less++;
            index++;
        }
       
        System.out.println("Maximum Score : "+ max_);
        System.out.println("Minimum Score : "+ min_);
        System.out.println("Average Score : "+ mean_);
        System.out.println("The number of students who scored below average score = "+less);
        
        
        
        
        
    }
    
    
        
        
    }
    

