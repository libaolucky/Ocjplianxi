package 二维数组的使用;

public class demo01 {
    public static void main(String[] args) {

        String[][] chs = new String[2][];//有两个一维数组
        chs[0] = new String[2];  //第一个一维数组中有2个元素  97,98
        chs[1] = new String[5];//第二个一维数组中有5个元素 99,100,null,null,null
        System.out.println("chs.length = " + chs.length);
        int i = 97;
        // chs.length 是2
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
            chs[a][b] = "" + i;  // a[0]=97  a[1]=98
            i++;  // i++ 是先赋值再加1         // b[1][0]=99 ,b[1][1]=100,null,null,null
         }
     }

      for (String[] ca : chs) {
          for (String c : ca) {
         System.out.print(c + " ");  //遍历的第一个一维数组
        }
         System.out.println();//输出的第二个一维数组
         }
}
}
