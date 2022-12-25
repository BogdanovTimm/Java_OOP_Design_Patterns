public class Facade_Datatype {
    private Datatype1 datatype1_instance = new Datatype1();
    private Datatype2 datatype2_instance = new Datatype2();
    private Datatype3 datatype3_instance = new Datatype3();

    public void run_all_functions () {
        datatype1_instance.function1();
        datatype2_instance.function2();
        datatype3_instance.function3();
    }
}
