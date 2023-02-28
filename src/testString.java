public class testString {
    public static void main(String[] args) {
        String str1 = "222";
        String str2 = new String("test");
        char [] chr = {'t','e','s','t','!'};
        String str3 = new String(chr);
        System.out.println(str3);
        System.out.println(str3.length());
        System.out.println(str1.concat(str2));
        double a1 = 56.7;
        int a2 = 1000;
        System.out.printf("1:%f,2:%d,3:%s",a1,a2,str3);
        System.out.println(String.format("1:%f,2:%d,3:%s",a1,a2,str3));

        System.out.println(str3.isEmpty());
        System.out.println(str3.contains("te"));

        char [] chr2 = str2.toCharArray();
        for(char i:chr2){
            System.out.println(i);
        }





    }



}
