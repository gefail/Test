public class Main {
    public static void main(String[] args) {
        System.out.println(isRN(2001));
        System.out.println(isSZ("2001"));
        int [] arrs = {1,5,3,7,9,4,6,99,11,22,2,8};
        arrs = mpsort(arrs);
        for (int i=0;i<arrs.length;i++) {
            System.out.print(arrs[i] + ",");
        }


    }

    //1.判断闰年
    public static boolean isRN(int year){
        boolean isrn = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        return isrn;
    }

    //2.判断字符字符串是否全部为数字
    public static boolean isSZ(String str){
        char [] ch = str.toCharArray();
        boolean issz = true;
        for (int i=0; i < ch.length; i++ ){
            //System.out.println(ch[i]);
            if ( !Character.isDigit(ch[i]) ){
                issz = false;
                break;
            }
        }
        return issz;
    }

    //3.冒泡排序
    public static int [] mpsort (int [] arr){
        for (int i=0 ; i < arr.length -1 ; i++) {
            for (int j=0; j < arr.length -1 - i; j++) {
                if (arr[j] > arr [j +1]) {
                    int temp = arr[j];
                    arr[j] = arr [j +1];
                    arr [j +1] = temp;
                }
            }
        }
        return arr;
    }

    
}