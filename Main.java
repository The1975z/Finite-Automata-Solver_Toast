
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Toaster toaster = new Toaster();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Toaster FSM (Binary");
            System.out.println("ใส่รหัสบิต 4 หลัก เช่น 0001 = power_on, 0010 = insert_bread, พิมพ์ exit เพื่อจบ");

            while (true) {
                System.out.print("🧠 Input Binary: ");
                String binary = scanner.nextLine();

                if (binary.equalsIgnoreCase("exit")) {
                    break;
                }

                String event = BinaryInputMapper.getEventFromBinary(binary);
                if (event.equals("invalid")) {
                    System.out.println("Invalid binary input!");
                } else {
                    toaster.handleEvent(event);
                }
            }
        }

        System.out.println("จบการทำงาน");
    }
}
