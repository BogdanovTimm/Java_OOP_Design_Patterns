import java.math.BigDecimal;
import java.util.Hashtable;

public class Facade_Datatype {

    private Hashtable<int, Interface1> hashtable1_of_instances_of_Interface1_Implementations;

    // Constructor
    public Facade_Datatype () {
        this.hashtable1_of_instances_of_Interface1_Implementations = new Hashtable<int, Interface1>;
    }

    public int constructor_for_instance_of_Interface1_Implementation_Datatype (String given_Interface1_Implementation_Datatype, BigDecimal argument2) {
        Interface1 facade_instance = null;
        switch (given_Interface1_Implementation_Datatype) {
            case "Interface1_Implementation_Datatype1":
                facade_instance = new Interface1_Implementation_Datatype1 (argument2);
                break;
            case "Interface1_Implementation_Datatype2":
                facade_instance = new Interface1_Implementation_Datatype2 (argument2);
                break;
            case "Interface1_Implementation_Datatype3":
                facade_instance = new Interface1_Implementation_Datatype3 (argument2);
                break;
            default:
                System.out.println("Invalid Interface1 implementation Datatype");
                break;
        }
        if (facade_instance != null) {
            this.hashtable1_of_instances_of_Interface1_Implementations.put (facade_instance.getter (), facade_instance);
            return facade_instance.getter ();
        }
        return -1;
    }
    public void function4 (int argument1, int argument2, BigDecimal argument3) {
        Interface1 variable1 = this.hashtable1_of_instances_of_Interface1_Implementations.get(argument1);
        Interface1 variable2 = this.hashtable1_of_instances_of_Interface1_Implementations.get(argument2);
        variable2.function3 (variable1, argument3);
    }
}
