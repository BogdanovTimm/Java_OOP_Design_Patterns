public abstract class Datatype_That_Cant_Have_Children_Datatypes implements Interface {
    public String variable3;

    @Override
    public void function1() {
        System.out.println("text1" + this.variable3);
    }

    @Override
    public void function2() {
        System.out.println("text2" + this.variable3);
    }

    @Override
    public void function3() {
        System.out.println("text3" + this.variable3);
    }

    @Override
    public void function4() {
        return this.variable3;
    }
}
