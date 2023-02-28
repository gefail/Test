public class testenum {
    public static void main(String[] args) {
        Color a = Color.BLUE;
        System.out.println(a);

        for (Color c : Color.values()) {
            System.out.println(c + ":" + c.ordinal());
        }
        System.out.println(Color.valueOf("RED"));
        a.pri();


    }


    enum Color {
        RED, GREEN, BLUE;
        Color(){
            System.out.println("xxxx" + this.toString());
        }
        public  void pri (){
            System.out.println("xxxxxxxxxxxxx");
        }

    }
}
