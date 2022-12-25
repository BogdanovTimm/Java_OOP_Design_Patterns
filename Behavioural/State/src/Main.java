public class Main {
    public static void main (String[] args) {
        State_Controller_Datatype state_controller_instance = new State_Controller_Datatype ();
        state_controller_instance.run_function_within_state_instance_that_displays_current_state();
        state_controller_instance.set_current_state (new State2_Datatype ());
        state_controller_instance.run_function_within_state_instance_that_displays_current_state();
        state_controller_instance.set_current_state (new State1_Datatype ());
        state_controller_instance.run_function_within_state_instance_that_displays_current_state();
    }
}