public class Reverse {

    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);

    }

    public static String reverse2(String input2) {
        String str[] = input2.split(" ");
        String finalStr="";
        for(int i = str.length-1; i>= 0 ;i--){
            finalStr += str[i]+" ";
        }
        return new String(finalStr);
    }


    
   public static void main(String[] arg){
    String string = "мама мыла раму";
    System.out.println(reverse2(reverse(string)));
    }
}
