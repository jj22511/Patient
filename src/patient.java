

public class patient extends mainClass{
     
    //Constructor 
    public patient(String[] firstName, String[] lastName){   
    }
    
    
    //getAge Class instantiate
    getAge ageClass = new getAge(age);
    //getAge Class instantiate
    getAddress addressClass = new getAddress(address);
     
    //Getting Information
    public void patientInfo()
    {
        System.out.println("Enter Patient Information");
        for( int i = 0; i<3; i++)
        {
            System.out.println("Patient Number " + (i+1) + ": ");
            System.out.print("Firstname: ");
            firstName[i] = input.nextLine();
            System.out.print("Surname: ");
            lastName[i] = input.nextLine();
            //add Age
            ageClass.addAge(i);
            //Add address
            addressClass.addAddress(i);
            System.out.println();
        }
    }
    
}
