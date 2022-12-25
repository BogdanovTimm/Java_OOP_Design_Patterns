class Checker3_Datatype extends Abstract_Checker_Parent_Datatype {
    // Constructor
    public Checker3_Datatype(Abstract_Checker_Parent_Datatype given_next_checker_instance){
        super(given_next_checker_instance);
    }
    @Override
    public void particular_check(int given_integer_to_particular_check) {
        System.out.println("3d checker is running...");
        if (given_integer_to_particular_check > 0) {
            System.out.println ("Check is done. Given integer is greater than 0");
        }
        else {
            System.out.println("3d checker have failed... Run 4th checker");
            super.particular_check(given_integer_to_particular_check);
        }
    }
}