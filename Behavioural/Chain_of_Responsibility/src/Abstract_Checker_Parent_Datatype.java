abstract class Abstract_Checker_Parent_Datatype {
    private Abstract_Checker_Parent_Datatype next_checker_instance;

    public Abstract_Checker_Parent_Datatype (Abstract_Checker_Parent_Datatype given_next_checker_instance){
        this.next_checker_instance = given_next_checker_instance;
    };
    public void particular_check(int given_integer_to_particular_check){
        if (next_checker_instance != null)
            next_checker_instance.particular_check(given_integer_to_particular_check);
    };
}