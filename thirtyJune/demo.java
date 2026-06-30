package thirtyJune;

class UnderAgeException extends Exception

{

UnderAgeException()

{

super("You are toooo young....");

}

}

import java.util.Scanner;

class DrivingLicence

{

int age;

void takeUserAge()

{

Scanner scan = new Scanner(System.in);

System.out.println("Enter the AGE :");

age = scan.nextInt();

}

void verify() throws UnderAgeException

{

if(age<18)

{

// UnderAgeException uae = new UnderAgeException();

// throw uae;

throw new UnderAgeException();

}

else

{

System.out.println("DrivingLicence Issued....");

}

}

}


public class Main {

    public static void main(String[] args) {
    
    DrivingLicence dl = new DrivingLicence();
    
    dl.takeUserAge();
    
    try
    
    {
    
    dl.verify();
    
    }
    
    catch (UnderAgeException e) {
    
    
    
    e.printStackTrace();
    
    System.out.println(e.getMessage());
    
    }
    
    }
    
    }