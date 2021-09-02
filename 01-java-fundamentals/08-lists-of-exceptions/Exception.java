import java.util.ArrayList;
public class Exception {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("Goodbye World");
        for (int i = 0; i<myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("SUCCESS at Index" + i + "my value is" + myList.get(i));
        } catch (ClassCastException e) {
            //Integer castedValue = (Integer) myList.get(i);
            System.out.println("ERROR at Index " + i + " my value is: "+  myList.get(i) + ".Reason: " + e);
        }
    }
    System.out.println("Are we out of loop?");
}
}