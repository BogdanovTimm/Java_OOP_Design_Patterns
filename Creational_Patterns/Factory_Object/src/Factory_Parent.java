public class Factory_Parent {
    public Parent_Datatype choose_Child_Datatype (String given_Child_Datatype) {
        Parent_Datatype instance = null;
        if (given_Child_Datatype.equals ("Child_Datatype_1")) {
            instance = new Child_Datatype1();
        }
        else (given_Child_Datatype.equals ("Child_Datatype_2")) {
            instance = new Child_Datatype2();
        }
        return instance;
    }
}
