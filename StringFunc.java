// ques 8

public class StringFunc {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("SHYAMA");
        StringBuilder stbr = new StringBuilder("ROHAN IS A GOOD BOY");
        System.out.println("Original String : " + stbr);
        stbr.setCharAt(0, 'S'); // change the char
        System.out.println("After using setCharAt(0,'S') : " + stbr);
        stbr.append(true); // ret
        System.out.println("After using append() " + stbr);
        System.out.println("Original length : " + sb.length() + " string :" + sb);
        sb.setLength(5);
        System.out.println("After using setLength(5) length : " + sb.length() + " string :" + sb);
        sb.insert(3, 'R');
        System.out.println("After using insert(3,'R') " + sb);
        String str1 = "AMAN", test = "AMAN";
        String str2 = " KUMAR";
        System.out.println(str1.equals(test)); // returns true
        System.out.println(str1.equals(str2)); // returns false
        System.out.println(str1.concat(str2));

    }
}