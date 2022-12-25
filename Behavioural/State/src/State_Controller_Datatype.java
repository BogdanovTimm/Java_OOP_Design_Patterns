class State_Controller_Datatype {
    private Interface current_state_instance;

    // Constructor
    public State_Controller_Datatype () {
        current_state_instance = new State1_Datatype();
        System.out.println("State controller instance has been created. Current state is set to Default state");
    }
    public void set_current_state (Interface given_state_instance) {
        current_state_instance = given_state_instance;
        System.out.println("Current state has been changed");
    }
    public void run_function_within_state_instance_that_displays_current_state () {
        current_state_instance.display_current_state (this);
    }
}