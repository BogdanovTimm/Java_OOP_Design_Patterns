public class Singleton_Datatype {
    public static Singleton_Datatype is_there_1_instance_of_Singleton_Datatype;

    // CONSTRUCTOR
    private Singleton_Datatype () {
        System.out.println ("Singleton instance is created");
    }

    public static Singleton_Datatype construct_1_instance_of_singleton_and_or_return_toString() {
        if (is_there_1_instance_of_Singleton_Datatype == null) {
            is_there_1_instance_of_Singleton_Datatype = new Singleton_Datatype();
        }
        System.out.println(is_there_1_instance_of_Singleton_Datatype);
        return is_there_1_instance_of_Singleton_Datatype;
    }
}
