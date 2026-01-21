public class SearchString {
    public static void main(String[] args) throws Exception {
        String str="Welcome to Java Programming";
        int id=str.indexOf("Welcome");
        if(id==-1){
            System.out.println("Welcome not found");
        }
        else{
            System.out.println("Found Welcome at index "+id);
        }
    }
}
