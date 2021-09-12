package Main方法的参数;

public class main方法 {
    public static void main (String[] args) {
        //args其实就是 编译的时候，用 黑框口 java---javac---class
         String arg1 = args[1];
         String arg2 = args[2];
         String arg3 = args[3];
         System.out.println("Arg is " + arg3);
     }
}
