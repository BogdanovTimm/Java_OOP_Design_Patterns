public class Store {
    private Factory_Parent factory_instance;

    // Constructor
    public Store (Factory_Parent given_factory_instance) {
        this.factory_instance = given_factory_instance;
    }

    public Parent_Datatype create_Child_Datatype_instance (String given_Child_Datatype) {
        Parent_Datatype instance;
        instance = factory_instance.choose_Child_Datatype (given_Child_Datatype);
        instance.function1 ();
        instance.function2 ();
        instance.function3 ();
        return instance;
    }
}
