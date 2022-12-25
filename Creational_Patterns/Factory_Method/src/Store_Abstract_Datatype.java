public abstract class Store_Abstract_Datatype {

    public Parent_Datatype create_Child_Datatype_instance (String given_Child_Datatype) {
        Parent_Datatype child_datatype_instance;
        child_datatype_instance = choose_Child_Datatype (given_Child_Datatype);

        child_datatype_instance.function1 ();
        child_datatype_instance.function2 ();
        child_datatype_instance.function3 ();

        return child_datatype_instance;
    }
    abstract Parent_Datatype choose_Child_Datatype (String given_Child_Datatype);
}
