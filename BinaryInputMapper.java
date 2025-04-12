public class BinaryInputMapper {
    public static String getEventFromBinary(String binary) {
        if (binary.length() > 10) {
            return "error";
        } else if (binary.equals("0001")) {
            return "power_on";
        } else if (binary.equals("0010")) {
            return "insert_bread";
        } else if (binary.equals("0011")) {
            return "start_toast";
        } else if (binary.equals("101101")) {
            return "toast_done";
        } else if (binary.equals("0110")) {
            return "error";
        } else if (binary.equals("1000")) {
            return "power_off";
        } else if (binary.equals("0101")) {
            return "remove_bread";
        } else if (binary.equals("1111")) {
            return "reset";
        } else {
            return "state_invalid";
        }
    }
    
}
