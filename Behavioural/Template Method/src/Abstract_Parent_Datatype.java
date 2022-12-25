public abstract class Abstract_Parent_Datatype {
    // final ensures that no child datatypes can change desired function behavior
    public final void desired_function () {
        common_function1();
        common_function2();
        common_function3();
        function_that_unique_for_each_child1();
        function_that_unique_for_each_child2();
        function_that_unique_for_each_child3();
    }

    protected abstract void function_that_unique_for_each_child1();
    protected abstract void function_that_unique_for_each_child2();
    protected abstract void function_that_unique_for_each_child3();
    private void common_function1() {
        System.out.println("Common function1 is running...");
    }
    private void common_function2() {
        System.out.println("Common function2 is running...");
    }
    private void common_function3() {
        System.out.println("Common function3 is running...");
    }
}
