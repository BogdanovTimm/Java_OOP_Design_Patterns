import java.util.ArrayList;
import java.util.List;

public class ArrayList_Datatype implements Interface {
    private List <Interface> arraylist_instance = new ArrayList <Interface> ();

    @Override
    public void display_item () {
        for (Interface variable1: arraylist_instance) {
            variable1.display_item();
        }
    }

    public void add_item (Interface given_item) {
        arraylist_instance.add (given_item);
    }

    public void remove_item (Interface given_item) {
        arraylist_instance.remove (given_item);
    }
}