public class Main {
    public static void main(String[] args) {
        Factory_Datatype factory_instance = new Factory_Datatype ();

        Interface datatype1_instance = factory_instance.construct_datatype_instance("Datatype1");
        datatype1_instance.function1();

        Interface datatype2_instance = factory_instance.construct_datatype_instance("Datatype2");
        datatype2_instance.function1();

        Interface datatype3_instance = factory_instance.construct_datatype_instance("Datatype3");
        datatype3_instance.function1();
    }
}