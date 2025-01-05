public class Strings_02_ShortestPath {
     
   public static void shortestPath(String string){
       int x = 0;
       int y = 0;
       
       for (int i = 0 ; i < string.length(); i++){
           if(string.charAt(i)== 'W'){
                x--;   
           }
           if(string.charAt(i)== 'E'){
                x++;   
           }
           if(string.charAt(i)== 'S'){
                y--;   
           }
           if(string.charAt(i)== 'N'){
                y++;   
           }
        }
        double shortestDistance = Math.sqrt(Math.pow(x,2)+ Math.pow(y,2));
        System.out.println(shortestDistance);
   }
        
    public static void main(String args[]){
        
        shortestPath("WNEENESENNN");
      
    }
}
