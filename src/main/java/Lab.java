import java.util.ArrayList;
import java.util.List;

public class Lab {
    /**
     * Serialization reflects the process of turning an Object into some format suitable for data interchange,
     * such as JSON or plain text. Depending on the exact format required, this may be adequately handled by your
     * object's toString method, or by Jackson Databind.
     *
     * Deserialization reflects the reverse process: turning some data interchange format, such as a plain text,
     * into a valid Java Object. Let's say that a List of integers in Java containing the values 2, 3, 5, 7
     * serializes to the plain text "[2, 3, 5, 7]".
     *
     * TODO: Given the serialized format for a List in Java, turn the String into its corresponding List and return it.
     *
     * @param input the serialized format of a List, eg [a, b, c, ... z]
     * @return a List object containing all the values defined in the input, in the same order.
     */
    public List<Integer> deserialize(String input){
        return null;
    }
}
