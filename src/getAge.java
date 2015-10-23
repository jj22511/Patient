
public class getAge extends mainClass{
    
        public getAge(int[] age){
                //Constructor
        }
        
        
        //Adding Age
        public void addAge(int i){
                System.out.print("Age: ");
                age[i] = input.nextInt();
        }
        //unsortedList  
        public void unsortedList(){
                System.out.println("UnSorted List.");
            for(int i = 0; i<3; i++){
                System.out.println("Patient #" + (i+1) + ": "+ firstName[i] + " " + lastName[i] + " " + age[i]);
            }
        }
        //Age Sort
        public void ageSort()
        {
            //Sort
               for( int a=1; a<age.length; a++)
               {
                int tmp = age[a];
                int b = a;
                while((b>0) && ( age[b-1] > tmp))
                {
                    age[b]=age[b-1]; //swap
                    b--;
                }
                age[b]=tmp;  //swap
                
                }
        }
        



}  
        


