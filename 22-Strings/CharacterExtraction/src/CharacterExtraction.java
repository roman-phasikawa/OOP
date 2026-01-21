public class CharacterExtraction {
    public static void main(String[] args) throws Exception {
        String str="Hello World!";
        char ch1=str.charAt(0);
        System.out.println("Character at 0 index is: "+ch1);

        int start=4;
        int end=8;
        char[] ch2=new char[end-start];
        str.getChars(start, end, ch2,0);
        System.out.println(ch2);

        byte[] ch3=str.getBytes();
        for(byte b:ch3){
            System.out.println(b);
        }

        char ch4[]=str.toCharArray();
        System.out.println(ch4);
    }
}
