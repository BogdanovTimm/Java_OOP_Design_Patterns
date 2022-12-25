public class Main {
    public static void main (String[] args) {

        Datatype1 datatype1_instance1 = new Datatype1 (100, "Lokesh Sharma", "Pro Developer");
        Datatype1 datatype1_instance2 = new Datatype1 (101, "Vinay Sharma", "Developer");

        ArrayList_Datatype arraylist_instance1 = new ArrayList_Datatype();
        arraylist_instance1.add_item (datatype1_instance1);
        arraylist_instance1.add_item (datatype1_instance2);

        Datatype2 datatype2_instance1 = new Datatype2 (200, "Kushagra Garg", "SEO Manager");
        Datatype2 datatype2_instance2 = new Datatype2 (201, "Vikram Sharma ", "Kushagra's Manager");

        ArrayList_Datatype arraylist_instance2 = new ArrayList_Datatype ();
        arraylist_instance2.add_item (datatype2_instance1);
        arraylist_instance2.add_item (datatype2_instance2);

        ArrayList_Datatype arraylist_root = new ArrayList_Datatype ();
        arraylist_root.add_item (arraylist_instance1);
        arraylist_root.add_item (arraylist_instance2);

        arraylist_root.display_item ();
    }
}