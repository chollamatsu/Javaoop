import java.util.Scanner;

class Matrix{
    private int size;
    private int [][]data = new int [50][50];
    boolean idenstatus;
    
    public void setSize(){
        Scanner input = new Scanner(System.in);
        System.out.print("input size: ");
        size = input.nextInt();//get metrix size
        
    }
    public void setData(){
        Scanner input = new Scanner(System.in);
        int i, j; // define i = row ,j= column
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){   
                //เงื่อนไขด้านล่างนี้ แค่ต้องการให้มันเว้นบรรทัดเฉยๆเพื่อให้อ่านง่าย
                if (j==size-1){
                    System.out.printf("input number [%d][%d]: ", i, j);
                    data[i][j] = input.nextInt();
                    System.out.println();
                }
                else{
                    System.out.printf("input number [%d][%d]: ", i, j);
                    // 3 line above ->  part of receiving input.
                    //but want to show what metrix is currently input & assign values 
                    //Well, right now we're creating a matrix, but right now our matrix doesn't have data to store, so we have to loop to store it. data into each channel
                    data[i][j] = input.nextInt();//after that, assign value.
                }
                
            }
        }
        
    }
    public void checkIdentity(){
        int i, j;
        idenstatus = true;
        
        for(i=0; i<size && idenstatus; i++){
            for(j=0; j<size && idenstatus; j++){
                if ((i == j) && (data[i][j] != 1))//check whether or not the diagonal row (\ like this) equals 1. If not equal to 1, work under this condition.
                    idenstatus = false;//change default of idenstatus
                else if  ((i != j) && (data[i][j] != 0))//Check if the non-diagonal rows are equal to 0 or not?. If not equal to 0, then work under this condition.
                    idenstatus = false;//change default of idenstatus
            }
        }
  
    }
    public void printResult(){
        if(idenstatus)
            System.out.print("This matrix is identity matrix.");
        else
            System.out.print("This matrix is not identity matrix.");  
        
    }
}
public class Lab04_1_591 {

    
    public static void main(String[] args) {
        
        Matrix m = new Matrix();
        m.setSize();
        m.setData();
        m.checkIdentity();
        m.printResult();
    }
    
}
