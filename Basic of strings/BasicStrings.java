class BasicStrings{
    public static void main(String[] args) {
        char[] ch={'H','E','L','L','O'};
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }
        System.out.println();
        for(char ele: ch){
            System.out.print(ele);
        }
        System.out.println();
        String s="Hello World!";
        System.out.println(s.charAt(8));
        System.out.println(s.length());
    }
}