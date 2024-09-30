import java.util.Scanner;
class MaxOccurringCharacter{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String: ");
   String s=sc.next();
   int[] freq=new int[26];
   for (int i = 0; i < s.length(); i++) {
       char ch=s.charAt(i);
       int idx=(int)ch-97;
       freq[idx]++;
   }
   int maxfreq=-1;
   for (int i = 0; i < freq.length; i++) {
       maxfreq=Math.max(maxfreq, freq[i]);
   }
   System.out.println("The maximum occurring character in string is: ");
   for(int i=0; i<freq.length; i++){
    if(freq[i]==maxfreq) {
      char ch=(char)(i+97);
      System.out.println(ch+" ");
    }
   }
}
}

