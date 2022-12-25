public class Observer_Datatype {
    protected Datatype1 current_datatype1_instance;

    // Constructor
    public Observer_Datatype (Datatype1 given_datatype1_instance) {
        this.current_datatype1_instance = given_datatype1_instance;
        this.current_datatype1_instance.add_new_observer (this);
    }
    public void update () {
        System.out.println("Some instance of observer has been notified that now variable1 from datatype1 is equal to " + current_datatype1_instance.getter_for_variable1());
    }
}