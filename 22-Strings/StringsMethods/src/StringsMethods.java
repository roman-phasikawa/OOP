public class StringsMethods {
    public static void main(String[] args) {
        String str=" Welcome  to ";
        String str1=" Java Programming";
        System.out.println("Str of length: "+str.length()+"\n"+"Str1 of length: "+str1.length());
        char char1=str.charAt(6);
        System.out.println("Char at index 6: "+char1);  
        System.out.println("Concat two Strings are: "+str.concat(str1));
        System.out.println("String are equal or not: "+str.equals(str1));   
        System.out.println("Display UpperCase: "+str.toUpperCase());
        System.out.println("Display LowerCase: "+str.toLowerCase());
        System.out.println("Sub String: "+str1.substring(2,7));
        System.out.println("Replace e-a: "+str.replace('e','a'));
        System.out.println("Remove extra white space from a strings: "+str.trim());
        System.out.println(str.compareTo(str1));
        
        String str2="hi,my,name,is,ram";
        String[] a=str2.split(",");
        System.out.println("Split Method: "+a[1]);
        
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println(str.indexOf('e'));
        System.out.println(str.lastIndexOf('P'));
    }
}
