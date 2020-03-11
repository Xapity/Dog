package dogtester;

import java.util.*;
import static dogtester.Dog.caringForYourDog;

public class DogTester {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please input the name of the first dog press enter and then + "
                + "\ninput the type of dog it is");
        Dog dog1 = 
                System.out.println("Now please input the name of the second dog press enter and then + "
                        + "\ninput the type of dog it is");

        //Print out the details of each dog
        System.out.println(dog1);
        System.out.println("--------------------------");
        System.out.println(dog2);
        System.out.println("--------------------------");
    //Print using the accessor methods
        //Values for dog1
        System.out.println(dog1.getName() + "'s Aggression: "
                + dog1.getAggression());
        //Values for dog2
        System.out.println(dog2.getName() + "'s Aggression: "
                + dog2.getAggression());

        System.out.println("Hey there doggie. Nice doggie...");

        //dog responds to stranger
        if (dog1.getAggression() > 5) {
            //dog1 is aggressive
            System.out.print(dog1.getName() + ": ");
            dog1.barkAngry();
            System.out.println("Slowly back away...");
            //what if dog is cranky from hunger?
            if (dog1.getHunger() > 7) {
                System.out.println("Hungry dog bares teeth...");
                dog1.barkAngry();
                System.out.println("Time to run!");
            }
        } else {
            //dog is friendly... so is the meeting
            System.out.print(dog1.getName() + ": ");
            dog1.barkFriendly();
            System.out.println("Good doggie... you pet dog");
        }

    }
}
