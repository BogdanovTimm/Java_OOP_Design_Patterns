public class Decorator1_Datatype extends Abstract_Decorator_Datatype {

    //Constructor
    public Decorator1_Datatype(Interface given_basic_or_decorator_instance) {
        super (given_basic_or_decorator_instance);
    }


    @Override
    public void function1 () {
        super.function1();
        this.function2();
    }

    public void function2 () {
        System.out.println ("function2 is running");
    }
}
