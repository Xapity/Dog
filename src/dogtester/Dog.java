package dogtester;

public class Dog {
    //variables for characteristics

    private String dogName, dogBreed;
    private int aggression, hunger, age;
    //aggression = 5; this is bad :(

    //constructors
    public Dog() {
        dogName = "Rufus Doe";
        dogBreed = "Unknown Breed";
        aggression = 0;
        hunger = 0;
        age = 0;
    }

    public Dog(String dgName, String dgBreed, int agg, int hung, int ag) {
        dogName = dgName;
        dogBreed = dgBreed;
        aggression = agg;
        hunger = hung;
        age = ag;
    }

    //Alternate constructor
    public Dog(String dgName, String dgBreed) {
        //This constructor only uses the name and breed
        //Set the aggression and hunger to random #s
        dogName = dgName;
        dogBreed = dgBreed;
        aggression = (int) (Math.random() * 10) + 1;
        hunger = (int) (Math.random() * 10) + 1;
        age = (int) (Math.random()*10 +1);
    }
       /**
     * This method allows the user to set the aggression of the dog
     * pre: needs an aggression value
     * post: sets the aggression value
     */
    public int getAggression(){
        return aggression;
    }
    /**
     * This method allows the user to set the aggression of the dog
     * pre: needs an aggression value
     * post: sets the aggression value
     */
    public void setAggression(int aggres){
        aggression = aggres;
    }
    /**
     * This method allows for a dog to friendly bark
     * pre: none
     * post: the dog object barks
     */

    public void barkFriendly() {
        System.out.println("Arf! Arf!");
    }

    public void barkAngry() {
        System.out.println("GRR! RRRFFF!");
    }
    
    public static void caringForYourDog(){
        System.out.println("This is how you care for your dog");
    }

    //method to display all info of the Dog
    public String toString() {
        String output = "Name: " + dogName + "\n";
        output += "Breed: " + dogBreed + "\n";
        output += "Aggression: " + aggression + "\n";
        output += "Hunger: " + hunger + "\n";
        output += "Age: " + age;
        //output string is complete, return it
        return output;
    }
    public String getName() {
    return dogName;
  }

  public void setName(String dgName){
    dogName = dgName;
  }

  public String getBreed() {
    return dogBreed;
  }

  public void setBreed(String dgBreed){
    dogBreed = dgBreed;
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int dogHung){
    hunger = dogHung;
  }

}
