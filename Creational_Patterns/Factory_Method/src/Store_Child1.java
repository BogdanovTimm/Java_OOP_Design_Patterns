public class Store_Child1 extends Store_Abstract_Datatype {
    Parent_Datatype choose_Child_Datatype (String given_Child_Datatype) {
        if (given_Child_Datatype.equals ("Child_Datatype1")) {
            return new Child_Datatype1 ();
        }
        else if (given_Child_Datatype.equals ("Child_Datatype2")) {
            return new Child_Datatype2 ();
        }
        else return null;
    }
}
