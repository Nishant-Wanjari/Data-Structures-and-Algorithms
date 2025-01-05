public class Strings_004_Substring {
    public static void main(String args[]){
        System.out.println(Substring("Learning Java & DSA", 0, 5));
    }
    
    public static String Substring(String string,int startIndex, int endIndex){
        String answer = new String();
        for (int i = startIndex; i < endIndex ; i++){
            answer = answer + string.charAt(i);
        }
        return answer;
    }
}
