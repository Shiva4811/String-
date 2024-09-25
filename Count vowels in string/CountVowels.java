import java.util.Scanner;
class CountVowels{
    public static boolean isVowel(char ch){
        if(ch=='a'|| ch=='A' ) return true;  
        if(ch=='e'|| ch=='E' ) return true;  
        if(ch=='i'|| ch=='I' ) return true;  
        if(ch=='o'|| ch=='O' ) return true;  
        if(ch=='u'|| ch=='U' ) return true; 
        return false; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=sc.nextLine();
        int n=str.length();
        System.out.println("THe length of the string is: "+n);
        int count=0;
        for(int i=0; i<n; i++){
            char ch=str.charAt(i);
            if(isVowel(ch)==true) count++;
        }
        System.out.println("The total number of vowels in String is: "+count);
       
    }
}