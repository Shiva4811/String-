import java.util.Arrays;
class Angaram{
    public static void show(char[] ch){
        for(char ele: ch){
            System.out.print(ele);
        }
        System.out.println();
    }
    public static void main(String args[]){
        StringBuilder s=new StringBuilder("angaram");
        StringBuilder t=new StringBuilder("nagaram");
        char[] ch=s.toString().toCharArray();
        char[] ch1=s.toString().toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        show(ch);
        show(ch1);
        if(t.length()!=s.length()) System.out.println("false");
        for(int i=0; i<t.length(); i++){
            if(ch[i]!=ch1[i]) System.out.println("false");
        }
        System.out.println("true");
    }
}