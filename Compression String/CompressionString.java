public class CompressionString {
    public static void main(String[] args) {
        String s="aaaaabbbbbhhhksksss";
        char[] arr=s.toCharArray();
        String ans="";
        int  i=0; int j=0;
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                int length=j-i;
                ans+=arr[i];
                if(length>1) ans+=length;
                i=j;
            }
        }
        int length=j-i;
        ans+=arr[i];
        if(length>1) ans+=length;
        System.out.println(ans);
    }
}
