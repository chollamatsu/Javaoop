
import java.util.Scanner;
class Land{
    protected float landsize;
}

class LandForHouse extends Land {
    private Float hprice;
    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Land size: ");
        landsize = input.nextFloat();
        System.out.print("Enter House Price: ");
        hprice = input.nextFloat();

        
    }
    public float getLandsize(){
        return landsize;
    }
    
    public Float getHouseprice(){
        return hprice;
    }
    
}

class LandForSale extends Land{
    private String titleDeed;
    private float evaluateprice,saleprice,price;
    private boolean status = false ;
    private boolean soldout = false;
    //LandForHouse landhouse = new LandForHouse();
    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Land size: ");
        landsize = input.nextFloat();
        System.out.print("Enter titleDeed: ");
        titleDeed = input.next();
        System.out.print("Enter evaluateprice: ");
        evaluateprice = input.nextFloat();
       
    }
    public String getTitleDeed(){
        return titleDeed;
    }
    public Float getEvaluate(){
        return evaluateprice;
    }
    
    public Float getLandsize(){
        return landsize;
    }
    
    public void calLandsize(Float house,Float sale){
        if(house <= sale && soldout == false){
            status = true;
        }
        
    }
    public boolean getStatus(){
        return status;
    }
    
    public void CalSalePrice(Float evaluate,Float houseprice){
        System.out.println("evaluate="+evaluate);
        System.out.println("houseprice="+houseprice);
        price = evaluate + ((float)(0.1)*evaluate)+ ((float)(0.05)*houseprice);
        System.out.println("price="+price);
        soldout = true;
        //return price;
    }
    public float getCalSalePrice(){
        return price;
    }
    
    public boolean getSoldout(){
        return soldout;
    }

}

public class Lab08_1_591 {

    
    public static void main(String[] args) {
       //get m and n only and other call method
       
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number for House: ");
       int n = input.nextInt();
       System.out.print("Enter number of Land: ");
       int m = input.nextInt();
       LandForHouse[] landh = new LandForHouse[n];
       LandForSale[] landfs = new LandForSale[m];
       
       float[] price=new float[m];
       float total=0,evaluate;
       
       for(int i=0;i<n;i++){
           System.out.println("Enter Data for House# "+(i+1));
           landh[i] = new LandForHouse();
           landh[i].setData(); 
           
           System.out.println();
       }
      
       
       for(int i=0;i<m;i++){
           System.out.println("Enter Data for Land# "+(i+1));
           landfs[i] = new LandForSale();
           landfs[i].setData(); 
          
           System.out.println();
       }
       
       for(int i=0;i<n;i++){
           
           for(int j=0;j<m;j++){
               if(landfs[j].getStatus()!=true && j<m){
                   
                   Float house = landh[i].getLandsize();
                   Float sale = landfs[j].getLandsize();
                   landfs[j].calLandsize(house,sale);
                   evaluate = landfs[j].getEvaluate();
                   float houseprice = landh[i].getHouseprice();
                   landfs[j].CalSalePrice(evaluate,houseprice);
                   price[j] = landfs[j].getCalSalePrice();
                   
               }
               
           }
       }
     System.out.println("---------------------------------");
     String titltdeed;
     System.out.println("Report for lands which can be sold");
     System.out.printf("Titledeed\t\tSale price");
     for(int i=0;i<m;i++){
         total += FindTotal(price[i],landfs[i].getEvaluate());
         System.out.println();
         titltdeed = landfs[i].getTitleDeed();
         System.out.println("   "+ ""+titltdeed+"                 "+price[i]);
         
     }
     System.out.println("Total"+total);
     
    }
    
    public static float FindTotal(float price,float evaluate){
        float total;
        System.out.println("price"+price);
        System.out.println("evaluate"+evaluate);
        total = price - evaluate;
        System.out.println("total"+total);
        return total;
    }

    
    
}
