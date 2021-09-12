package 局部变量和成员变量;

public class 局部变量和成员的Qubie01 {
    int x, y; // 默认值 0 , 0  成员变量
    public 局部变量和成员的Qubie01(int x, int y) {
     initialize(x, y);
 }

    public void initialize(int x, int y) {
         this.x = x * x;
         this.y = y * y;
     }

        public static void main(String[] args) {
            int x = 3, y = 5;  // 局部变量
         局部变量和成员的Qubie01 obj = new 局部变量和成员的Qubie01(x, y);
            // 把局部变量赋值给了test对象
     System.out.println(x + " " + y);// 调用的不是test对想,
        //调用的是 局部 变量. 所以 不是 9 ,25 , 是 3 ,5,
}
}
