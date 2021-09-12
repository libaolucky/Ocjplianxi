package SwitchCase的传值类型;

public class demo01 {
    public static void main(String[] args) {
    //line n1
       // byte x=1;
        //Short x=1;
       // long x=1;
        //'char, byte, short, int, Character, Byte, Short, Integer, String,
       Integer x = new Integer("1");
    switch (x) {
         case 1:
         System.out.println("One");
            break;
         case 2:
             System.out.println("Two");
             break;
         }
     }
}
