public class MaxNumberStringArray {
    public static void main(String args[]){
        String[] arr={"12223","8249","8234","9284"};
        String maxS=arr[0];
        for(int i=0; i<arr.length; i++){
            maxS=max(maxS, arr[i]);
        }
        System.out.println(maxS);
    }
    public static String max(String a, String b){
        String s=purify(a); String t=purify(b);
        if(s.length()>t.length()) return a;
        if(t.length()>s.length()) return b;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        } 
        if(a.length()>=b.length()) return a;
        else return b; 
    }
    public static String purify(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=0) return str.substring(i);
        }
        return str;
    }
}
