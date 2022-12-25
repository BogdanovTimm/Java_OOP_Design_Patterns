public class Main {
    public static void main(String[] args) {
        //fetch student record based on his roll no from the database
        Model_Datatype model  = retriveStudentFromDatabase();

        //Create a view : to write student details on console
        View_Datatype view = new View_Datatype();

        Controller_Datatype controller = new Controller_Datatype(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Model_Datatype retriveStudentFromDatabase(){
        Model_Datatype student = new Model_Datatype();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}