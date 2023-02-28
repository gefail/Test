import java.lang.reflect.Array;
import java.util.Arrays;

public class testarray {
    public static void main(String[] args) {
        int [] arr0 ;
        int [] arr1 = new int[5];
        int [] arr2 = {1,2,3,4,5};

        String [][] arr3 = new String[2][3];
        String [][] arr4 = new String[2][];
        arr4[0] = new String[2];
        arr4[1] = new String[3];
        arr4[0][0] = new String("Good");
        arr4[0][1] = new String("Luck");
        arr4[1][0] = new String("to");
        arr4[1][1] = new String("you");
        arr4[1][2] = new String("!");


        arr1[0] = 5;
        arr1[1] = 4;
        arr1[2] = 3;
        arr1[3] = 2;
        arr1[4] = 1;
        int total = 0;

        for (int i:arr1){
            total += i;
        }
        System.out.println(total);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            
        }

        int max = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (max < arr2[i]){
                max = arr2[i];
            }
        }
        System.out.println(max);

        sprint(arr2);
        System.out.println("****************************");
        sprint(jh(arr2));
        System.out.println("****************************");

        ssprint(arr4);
        System.out.println(Arrays.binarySearch(arr4[0],"Luck1"));



    }


    public static void sprint (int array[]) {
        for (int i: array){
            System.out.println(i);

        }
    }

    public static int [] jh (int array[]){
        int [] aa = new int[array.length];
        for (int i = 0,j= array.length-1; i < array.length; i++,j--) {
            aa[j] = array[i];

        }
        Arrays.sort(aa);
        return  aa;

    }

    public static void ssprint(String [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

        }

    }
}
