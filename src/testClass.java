public class testClass {
    public int t1;
    public String t2;
    public double t3;

    public testClass() {
        System.out.println("11111111111");
    }

    public testClass(int t1, String t2, double t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        System.out.println("222222222222");
    }

    public int getT1() {
        return t1;
    }

    public String getT2() {
        return t2;
    }

    public double getT3() {
        return t3;
    }

    public static void main(String[] args) {
        testClass tc = new testClass(1,"sss",15.7);
        System.out.println(tc.getT2());

    }



}
