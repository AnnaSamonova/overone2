package samonova.lesson23;

import java.util.Arrays;

public class Lesson23 {
    public static void main(String[] args) {

        StringBuffer stringBufer = new StringBuffer();
        stringBufer.append(2);
        stringBufer.append(" hhh ");
        stringBufer.append(false);
        stringBufer.append(Arrays.asList(1,2,3));
        System.out.println(stringBufer);

        StringBuffer stringBufer1 = new StringBuffer();
stringBufer1.append("ddd").append(2);
        System.out.println(stringBufer1);

      //  stringBufer.delete(0,2);
       // System.out.println(stringBufer);

       // stringBufer.replace(2,9, "222222222222");
       // System.out.println(stringBufer);

        System.out.println(stringBufer.reverse());

        System.out.println(stringBufer.substring(5, 8));

        String s = "222";
         StringBuffer strr = new StringBuffer(s);

         strr.setLength(9);
        System.out.println(strr.toString());

strr.setLength(2);
        System.out.println(strr);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        ///*******************************************************
        String sss = "4425232";
        StringBuffer stringBuffer2 = new StringBuffer(sss);
        stringBuffer2.setLength(9);
        System.out.println(stringBuffer2.toString());

    }
}
