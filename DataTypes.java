package demo;
public class  DataTypes
 {
    public static void main(String[] args) {
        int num = 65;

        
        char ch = (char) num;
        System.out.println("int to char: " + ch); // A

      
        long l = (long) ch;
        System.out.println("char to long: " + l); // 65

       
        int i = (int) l;
        System.out.println("long to int: " + i); // 65

        short s = (short) i;
        System.out.println("int to short: " + s); // 65

        
        byte b = (byte) s;
        System.out.println("short to byte: " + b); // 65
    }
}


