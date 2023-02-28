import java.io.*;

public class testStream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String s1 = br.readLine();
        br.close();
        System.out.println(s1);

        File f = new File("C:\\Wen\\Temp\\tt.txt");
        InputStream is = new FileInputStream(f);
        byte [] a = new byte[is.available()];
        while(is.read(a)!=-1){
        }
        is.close();
        String ss = new String(a,"UTF-8");
        System.out.println(ss);

        File f2 = new File("C:\\Wen\\Temp\\xx.txt");
        OutputStream os = new FileOutputStream(f2);
        String s2 = "111\n" +
                "xxx\n" +
                "666\n" +
                "张三";
        os.write(s2.getBytes("UTF-8"));
        os.flush();
        os.close();

        String filepath = "C:\\Wen\\Temp";
        File f3 = new File(filepath);
        //f3.mkdirs();
        for (String s : f3.list()){
            File tmp = new File(filepath+"\\"+s);
            if (tmp.isDirectory()){
                System.out.println(filepath+"\\"+s+":目录");
            }else{
                System.out.println(filepath+"\\"+s+":文件");
            }
        }

        for (File xx :f3.listFiles()){
            System.out.println(xx);

        }





    }
}
