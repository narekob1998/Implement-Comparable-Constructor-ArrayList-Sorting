//Student Name: Narek Bayramyan
//Submission Time: 5:40
package NarekB;
import java.util.ArrayList;
import java.util.Collections;
public class Cars {
    
public static void main(String[] args)    
 {
        
Car c1 = new Car(12313131, 2009, "Camry"); 
c1.setMileage(60000); 
//System.out.println(c1.getInfo());

Car c2 = new Car(95645421, 2010, "Accord"); 
c2.setMileage(95000); 
//System.out.println(c2.getInfo());

Car c3 = new Car(45746587, 2008, "CX5"); 
c3.setMileage(600); 

Car c4 = new Car(12313131, 2009, "Yaris"); 
c4.setMileage(50000);
//System.out.println(c3.getInfo());
     
ArrayList<Car> car = new ArrayList<>();
car.add(c4);
car.add(c3);
car.add(c2);
car.add(c1);

Collections.sort(car);

    System.out.println("\t|");
    System.out.println("\t|");
    System.out.println("\t|");
    System.out.println("\tV");
    //System.out.printf("\t " + c1.getInfo() + "\n\t " + c2.getInfo() + "\n\t " + c3.getInfo() + "\n\t " + c4.getInfo());
   
            for(Car c: car)
    
    System.out.println("Sorted" + "\t " + c.getInfo());
    
    System.out.println("\n\t^");  
    System.out.println("\t|");
    System.out.println("\t|");
    System.out.println("\t|");
   
 }
    
}
