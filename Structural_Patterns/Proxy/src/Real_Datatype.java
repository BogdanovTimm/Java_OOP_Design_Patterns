public class Real_Datatype implements Interface {
    // Constructor
    public Real_Datatype () {
        function2 ();
    }
    @Override
    public void desired_function () {
        System.out.println ("Instance of a Real_Datatype is found. Desired function is running...");
    }

    public void function2 () {
        System.out.println("Can't find an instance of Real_Datatype... Create a new instance of a Real_Datatype...");
    }
}