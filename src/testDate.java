import java.text.SimpleDateFormat;
import java.util.Date;

public class testDate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sf.format(d));
        System.out.println("*********************************");
        System.out.printf("%tF \n",d);
        System.out.printf("%tT \n",d);


    }
}
