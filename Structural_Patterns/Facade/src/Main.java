import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Facade_Datatype facade_instance = new Facade_Datatype();
        int instance_of_interface1_implementation_datatype1 = facade_instance.constructor_for_instance_of_Interface1_Implementation_Datatype ("Interface1_Implementation_Datatype1", new BigDecimal (500.00));
        int instance_of_interface1_implementation_datatype2 = facade_instance.constructor_for_instance_of_Interface1_Implementation_Datatype ("Interface1_Implementation_Datatype2", new BigDecimal (500.00));

        facade_instance.function4 (instance_of_interface1_implementation_datatype1, instance_of_interface1_implementation_datatype2, new BigDecimal (500.00));
    }
}