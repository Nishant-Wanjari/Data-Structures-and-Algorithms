public class Strings_007_ToUpperCase {
    public static void main(String args[]){
        String string = "hi i am java developer";
        System.out.println(UpperCase(string));
    }
    
    public static String UpperCase(String string){
        StringBuilder sb = new StringBuilder();
        
        char ch = Character.toUpperCase(string.charAt(0));
        sb.append(ch);
        
        
        for (int i = 1; i < string.length(); i++){
            if(string.charAt(i) == ' ' && i<string.length()-1){
                sb.append(string.charAt(i));
                i++;
                sb.append(Character.toUpperCase(string.charAt(i)));
            }else{
                sb.append(string.charAt(i));
            }
        }
        return sb.toString(); 
    }
}
