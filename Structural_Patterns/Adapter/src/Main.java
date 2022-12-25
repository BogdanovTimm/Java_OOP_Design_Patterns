public class Main {
    public static void main(String[] args) {
        String variable5 = "Host: https://google.com/n/r";
        Adaptee_Datatype adaptee_instance = new Adaptee_Datatype (variable5);
        Adapter_Datatype adapter_instance = new Adapter_Datatype();
        adapter_instance.create_reference_to_adaptee_instance (adaptee_instance);
        Client_Datatype client_instance = new Client_Datatype (adapter_instance);
        client_instance.function_that_client_use ();
    }
}