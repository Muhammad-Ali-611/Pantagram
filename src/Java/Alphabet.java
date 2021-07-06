package Java;

public class Alphabet {
    public static void main(String abc[]) {

        for (int i = 1; i<27; i++){         // increase count 10 to 27 to print till "z"

            String stCh = "";
            int alphabet = 97;              //ASCII value of A = 65 and a=97

            for (int j=1; j<=i; j++){

                stCh=stCh+(char)alphabet + " + ";
                alphabet++;
            }
            System.out.println("(" + stCh.substring(0,stCh.length()-3) + ")");
        }
            }
        }


