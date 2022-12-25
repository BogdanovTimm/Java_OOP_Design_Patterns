public class Decorator2_Datatype extends Abstract_Decorator_Datatype {
    // Constructor
    public Decorator2_Datatype (Interface given_basic_or_decorator_instance) {
        super (given_basic_or_decorator_instance);
    }
    @Override
    public void function1 () {
        super.function1();
        this.function3();
    }
    public void function3 () {
        System.out.println ("function3 is running");
    }
}
