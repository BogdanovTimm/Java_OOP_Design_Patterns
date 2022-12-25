public class Factory_Datatype {

    public Interface construct_datatype_instance (String desired_datatype_instance) {
        if (desired_datatype_instance == null) {
            return null;
        }
        if (desired_datatype_instance.equals ("Datatype1")) {
            return new Datatype1 ();
        }
        else if (desired_datatype_instance.equals ("Datatype2")) {
            return new Datatype2 ();
        }
        else if (desired_datatype_instance.equals ("Datatype3")) {
            return new Datatype3 ();
        }
        return null;
    }
}
