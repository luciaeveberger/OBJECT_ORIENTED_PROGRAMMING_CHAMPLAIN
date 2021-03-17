package CH_9;

public class Grasshopper extends Insect {
    // our grasshopper can do all of the insect stuff
    // AND it can jump!
    public String name;

    public Grasshopper(String inputName){
        this.name = inputName;
    }



    public void jump() {

    }

    @Override
    public String toString() {
        return "Grasshopper{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Grasshopper g = new Grasshopper("Francis");
        Grasshopper e = new Grasshopper("Ethan");
        System.out.println(g.toString());

        // we are not dealing in primative types !
        if (e.equals(g)){
            System.out.println("do something crazy!");
        }
        else{
            System.out.println("These are different examples!!!");
        }

        String k = "hello";
        String j = "hello";

        // == > WHERE ARE UUUUU $jfuauf:memory
        // .equals => WHO/ OR WHAT ARE YOU?? => hello, hello
        if (k.equals(j)){
            System.out.println("sundaes for everyone!");
        }



    }


}
