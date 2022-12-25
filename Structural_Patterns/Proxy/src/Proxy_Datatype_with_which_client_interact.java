public class Proxy_Datatype_with_which_client_interact implements Interface {
    private static Interface instance;
    @Override
    public void desired_function () {
        if (instance == null) {
            instance = new Real_Datatype ();
        }
        instance.desired_function();
    }
}
