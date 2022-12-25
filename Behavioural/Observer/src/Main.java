public class Main {
    public static void main(String[] args) {
        Datatype1 subject = new Datatype1();

        new Observer_Datatype (subject);

        subject.setter_for_variable1 (15);
        subject.setter_for_variable1 (10);
    }
}