package Main方法的参数;

public class Test {
    static int count = 0;
    int i = 0;

    public void changeCount() {
         while (i < 5) {
             i++;
             System.out.println("i = " + i);
             count++;
             System.out.println("count = " + count);
         }
        System.out.println("izong = " + i);
        System.out.println("count zong = " + count);
    }

    public static void main(String[] args) {
         Test check1 = new Test();
         Test check2 = new Test();
         Test check3 = new Test();
         check1.changeCount(); //
         check2.changeCount();
         check3.changeCount();
         System.out.print(check1.count + " : " + check2.count+":"+check3.count);
    }
}
