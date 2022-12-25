import java.util.ArrayList;
import java.util.List;
public class Invoker {
    private List <Interface> queque = new ArrayList <Interface> ();

    public void add_function_handler_instance_to_queque(Interface given_function_handler_instance) {
        queque.add (given_function_handler_instance);
        System.out.println ("Function has been added to queque");
    }

    public void run_functions_from_queque () {

        for (Interface current_function_from_queque : queque) {
            current_function_from_queque.do_handled_function();
        }
        queque.clear ();
    }
}