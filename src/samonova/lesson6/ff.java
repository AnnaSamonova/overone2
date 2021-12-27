package samonova.lesson6;

public class ff {

        public static void main(String[] args) {
            System.out.print("четные ");
            int i = 234567654;
            int k = 0;
            int ch = 0;
            int nech = 0;


            while (i > 0) {

                k = i % 10;
                if (k % 2 == 0) {
                    ch = k % 10;


                } else  {
                    nech = k * 10;
                }

                i = i / 10;

            }

            System.out.print(ch);
            System.out.println(nech);
        }
    }


