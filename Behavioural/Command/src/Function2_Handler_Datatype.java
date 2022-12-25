public class Function2_Handler_Datatype implements Interface {
    private Requester_Datatype current_requester;

    // Constructor
    public Function2_Handler_Datatype(Requester_Datatype given_requester_instance){
        this.current_requester = given_requester_instance;
    }
    @Override
    public void do_handled_function () {
        current_requester.function2 ();
    }
}