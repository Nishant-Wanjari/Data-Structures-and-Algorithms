import java.util.*;

public class RootToLeafPath {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }

    }

    public static void main(String[] args) {
       Node root = new Node(8);
       root.left = new Node(5);
       root.right = new Node (10);
       root.left.left = new Node(3);
       root.left.right = new Node(6);
       root.right.right = new Node(11);  

       printPath(root,new ArrayList<>());

    }

    

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void printResult(ArrayList<Integer> path){
        for(int i = 0; i < path.size();i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println("Null");
    }

    public static void printPath(Node root, ArrayList<Integer> path){
        if(root ==null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printResult(path);
        }
        printPath(root.left,path);
        printPath(root.right,path);
        path.remove(path.size()-1);
    }

}