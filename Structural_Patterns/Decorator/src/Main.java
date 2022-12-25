public class Main {
    public static void main(String[] args) {
        Interface base_instance = new Basic_Datatype();
        Interface decorator1_instance = new Decorator1_Datatype(base_instance);
        Interface decorator2_instance = new Decorator2_Datatype(decorator1_instance);
        decorator2_instance.function1 ();
    }
}