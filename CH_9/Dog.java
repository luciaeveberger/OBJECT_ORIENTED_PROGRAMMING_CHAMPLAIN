package CH_9;

public class Dog {
    // are going to be the data that represents this dog

    public String name;
    public int age;
    public boolean hasPointedEars; // true or false => isPoison, or hasValue or isAppropvedForBankAccount

    // construcotr => let us set up our object => setting up this default object for us
    public Dog(){
        this.name = "Default";
        this.age = 0;
        this.hasPointedEars = false;
    }
    public Dog(String setName, int setAge, boolean setHasPointedEars){
        // this constructor allows us to pass arguments to the ur object
        this.name = setName;
        this.age = setAge;
        this.hasPointedEars = setHasPointedEars;

    }

    @Override
    public String toString() {
        // print out our object
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasPointedEars=" + hasPointedEars +
                '}';
    }
    // our setter methods => Allow us to update our objects// to define them more precisely
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // this method is only accessable to the object itself!
    private void printValues(){
        System.out.println(3);
    }

    // methods are operations, they are actions the class or object will do!
    // overloaded methods!!
    public void bark(){
        System.out.println("RUFFFFFFFFF");
    }

    public void bark(int volumeOfBark){
        System.out.println("RUFF, volumne: " + volumeOfBark);

    }
    public static void bark(int volumeOfBark, String whoAreYouBarkingAt){
        System.out.println("RUFF, volumne: " + volumeOfBark);
        System.out.println("Please stop barking at: " + whoAreYouBarkingAt);

    }
    public String returnWarningBark(){
        return "RUFFF * 1000"; // why is this an error?
    }

    public int increaseDogAge(){
        this.age = this.age +1;
        return this.age;
    }



    public static void main(String[] args) {
//        Dog defaultDog = new Dog();
//        Dog goldenRetreiver = new Dog("Golden Retriever", 4, false);
//        Dog pitbull = new Dog("Pitbull", 2, false);
//       // tell us where this is stored in memory!! where java has put this!
//
//        System.out.println(defaultDog);
//        System.out.println(goldenRetreiver);
//        defaultDog.setName("Boston Terrier");
//        defaultDog.setAge(3);
//        System.out.println(defaultDog);
//        // we are calling a method on our object
////        defaultDog.bark();
////        // we are barking with some volume
////        pitbull.bark(600);
////        defaultDog.bark(400);
//
//        pitbull.bark(100000, "Neighbour Jane");
//        String output = pitbull.returnWarningBark();

        // conversion, utility & instances where we DO not use the object or class' data!
        double returnValue = Math.sqrt(10.0);
        double returnValue1 = Math.sqrt(20.0);
        System.out.println(Math.sqrt(20.0));
        Dog.bark(10, "Jane");

    }



}
