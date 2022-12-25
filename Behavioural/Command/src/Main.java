public class Main {
    public static void main(String[] args) {
        Requester_Datatype requester_instance = new Requester_Datatype ();

        Function1_Handler_Datatype function1_handler_instance = new Function1_Handler_Datatype (requester_instance);
        Function2_Handler_Datatype function2_handler_instance = new Function2_Handler_Datatype (requester_instance);

        Invoker invoker_instance = new Invoker();

        invoker_instance.add_function_handler_instance_to_queque (function1_handler_instance);
        invoker_instance.add_function_handler_instance_to_queque (function2_handler_instance);
        invoker_instance.run_functions_from_queque ();
    }
}