import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testDate {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sf.format(d));
        System.out.println("*********************************");
        System.out.printf("%tF \n",d);
        System.out.printf("%tT \n",d);


        SimpleDateFormat sff = new SimpleDateFormat("yyyy/MM/dd");
        String rq = "1991/03/26";
        Date dd = sff.parse(rq);
        System.out.println(dd.toString());


        long x = d.getTime() - dd.getTime();
        System.out.println("毫秒："+ x);
        System.out.println("秒："+ x/1000);
        System.out.println("分："+ x/1000/60);
        System.out.println("时："+ x/1000/60/60);
        System.out.println("天："+ x/1000/60/60/24);













    }
}
