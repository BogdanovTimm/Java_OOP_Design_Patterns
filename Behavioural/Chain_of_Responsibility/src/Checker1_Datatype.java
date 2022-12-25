class Checker1_Datatype extends Abstract_Checker_Parent_Datatype {
    // Constructor
    public Checker1_Datatype (Abstract_Checker_Parent_Datatype given_next_checker_instance) {
        super (given_next_checker_instance);
    }
    @Override
    public void particular_check(int given_integer_to_particular_check) {
        System.out.println("1st checker is running...");
        if (given_integer_to_particular_check < 0) {
            System.out.println ("Check is done. Given integer is less than 0");
        }
        else {
            System.out.println("1st checker have failed... Run 2d checker");
            super.particular_check(given_integer_to_particular_check);
        }
    }
}