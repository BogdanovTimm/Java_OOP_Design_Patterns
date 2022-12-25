public class Chain {
    Abstract_Checker_Parent_Datatype chain_progression;
    
    // Constructor
    public Chain () {
        create_chain ();
    }
    private void create_chain () {
        chain_progression = new Checker1_Datatype (new Checker2_Datatype (new Checker3_Datatype (null)));
    }
    public void overall_check (int given_integer_to_overall_check) {
        chain_progression.particular_check (given_integer_to_overall_check);
    }
}