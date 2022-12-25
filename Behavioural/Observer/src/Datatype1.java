import java.util.ArrayList;
import java.util.List;
public class Datatype1 {
    private List <Observer_Datatype> arraylist_of_observers = new ArrayList <Observer_Datatype>();
    private int variable1;

    public int getter_for_variable1 () {
        return variable1;
    }

    public void setter_for_variable1 (int variable1) {
        this.variable1 = variable1;
        System.out.println ("Variable1 has been set to " + variable1);
        notify_everyone_in_arraylist_of_observers();
    }

    public void add_new_observer (Observer_Datatype given_observer) {
        arraylist_of_observers.add (given_observer);
        System.out.println ("New observer has been added");
    }

    public void notify_everyone_in_arraylist_of_observers () {
        for (Observer_Datatype curent_observer_from_arraylist_of_observers : arraylist_of_observers) {
            curent_observer_from_arraylist_of_observers.update();
        }
    }
}