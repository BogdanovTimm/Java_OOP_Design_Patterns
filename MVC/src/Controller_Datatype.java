public class Controller_Datatype {
    // Actually Controller must have user input field
    private Model_Datatype model_instance_to_handle;
    private View_Datatype view_instance_to_handle;

    // Constructor
    public Controller_Datatype (Model_Datatype model, View_Datatype view){
        this.model_instance_to_handle = model;
        this.view_instance_to_handle = view;
    }

    public void setStudentName(String name){
        model_instance_to_handle.setName(name);
    }

    public String getStudentName(){
        return model_instance_to_handle.getName();
    }

    public void setStudentRollNo(String rollNo){
        model_instance_to_handle.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model_instance_to_handle.getRollNo();
    }

    public void updateView(){
        view_instance_to_handle.printStudentDetails(model_instance_to_handle.getName(), model_instance_to_handle.getRollNo());
    }
}