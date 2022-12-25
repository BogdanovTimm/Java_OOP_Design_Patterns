import java.util.ArrayList;

public class Datatype_That_Can_Have_Children_Datatypes implements Interface {
    private ArrayList <Interface> array_list_of_datatypes_that_can_and_cant_have_children_datatypes;
    private String variable2;

    // Constructor
    public Datatype_That_Can_Have_Children_Datatypes (String argument1) {
        this.array_list_of_datatypes_that_can_and_cant_have_children_datatypes = new ArrayList <Interface> ();
        this.variable2 = argument1;
    }

    @Override
    public void function1() {
        // very cool function body
    }

    @Override
    public void function2() {
        // very cool function body
    }

    @Override
    public void function3() {
        System.out.println("text1" + this.function4());
        for (Interface variable3 : this.array_list_of_datatypes_that_can_and_cant_have_children_datatypes)
            System.out.println (variable3.function4());
    }

    @Override
    public String function4 () {
        return this.variable2;
    }

    public int add_item_to_array_list_of_datatypes_that_can_and_cant_have_children_datatypes (Interface argument1) {
        this.array_list_of_datatypes_that_can_and_cant_have_children_datatypes.add (argument1);
        return this.array_list_of_datatypes_that_can_and_cant_have_children_datatypes.size () - 1;
    }

    public Interface getter_for_item_from_array_list_of_datatypes_that_can_and_cant_have_children_datatypes (int argument1) {
        return this.array_list_of_datatypes_that_can_and_cant_have_children_datatypes.get (argument1);
    }
}
