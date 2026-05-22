public class CreateInitializeThree {
    public static void main(String[] args) {

        //  Creating an object named thing.  Instantiation of the Thing class created below.
        Thing thing = new Thing();


        //  Creating another object named thing1
        Thing thing1 = new Thing();

        //  We now have two objects created from the same class; however, they are distinct entities.
        System.out.println(thing.equals(thing1));

        // Because...
        System.out.println(thing.hashCode());
        System.out.println(thing1.hashCode());

    }
}


// Creating a class named Thing.  No access modifier allowed if declared in Main.
// Presently it does nothing.
class Thing {

    //  No Argument Constructor; has no visible results and works the same if absent.
    Thing(){}

    //  Multiple constructors are allowed.  This allows objects to be set in a specific ways; custom initialization.
    //  Examples elsewhere.

}