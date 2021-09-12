package Main方法的参数;

class Alpha {
    int ns;
    static int s; //静态变量 初始值是0

    Alpha(int ns) { //ref1 是50
        if (s < ns) {
            s = ns;  // s=ns=50  s=ns=125
            System.out.println("ns = " + ns);
            System.out.println("s = " + s);
            this.ns = ns;
        }
    }

    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }

}
