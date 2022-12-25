public abstract class Abstract_Decorator_Datatype implements Interface {
    
    protected Interface basic_or_decorator_instance;

    // Constructor
    public Abstract_Decorator_Datatype (Interface given_basic_or_decorator_isntance) {
        this.basic_or_decorator_instance = given_basic_or_decorator_isntance;
    }

    @Override
    public void function1 () {
        this.basic_or_decorator_instance.function1();
    }
}
