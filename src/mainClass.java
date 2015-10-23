import java.util.Scanner;

public class mainClass {
    
 Scanner input = new Scanner(System.in);    
    /*
    * GLOBAL VARIABLES
    */
     public static int arrayIndex; 
     final static int value = 3;
     public static String[] firstName = new String[value];
     public static String[] lastName = new String[value];
     public static String[] address = new String[value];
     public static int[] age = new int[value];
     
    
     
    public static void main(String[] args){
        //patient class
        patient patientClass = new patient(firstName, lastName);
        patientClass.patientInfo();
        
        //getAge Class instantiate
        getAge ageClass = new getAge(age);
        ageClass.ageSort();
        
        
      
        
        
   
    }
    
}