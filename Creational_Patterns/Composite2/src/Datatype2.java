public class Datatype2 implements Interface {

    private long variable1;
    private String variable2;
    private String variable3;

    public Datatype2(long given_variable1, String given_variable2, String given_variable3) {
        this.variable1 = given_variable1;
        this.variable2 = given_variable2;
        this.variable3 = given_variable3;
    }

    @Override
    public void display_item() {
        System.out.println(variable1 +" " + variable2);
    }
}