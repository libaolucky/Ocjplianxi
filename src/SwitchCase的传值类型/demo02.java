package SwitchCase的传值类型;

public class demo02 {
    public static void main(String[] args) {
        //boolean opt = true;
        String opt = "true";
        switch (opt) {
            case "true":
                System.out.print("True");
                break;
            default:
                System.out.print("***");
            }
         System.out.println("Done");
       }
}
