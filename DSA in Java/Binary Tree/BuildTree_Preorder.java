import java.util.*;

public class BuildTree_Preorder {
    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Root Node Data : " + root.data);
        BinaryTree.preorder(root);
        BinaryTree.inorder(root);
        BinaryTree.levelOrder(root);
        
    }

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        //TC - O(n)
        public static Node buildTree(int nodes[]){
            index ++;

            if (nodes[index]==-1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        //TC - O(n) 
        public static void preorder(Node root){
            if(root==null){
                System.out.println(" -1 ");
                return;
            }
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        //TC - O(n) 
        public static void inorder(Node root){
            if(root==null){
                System.out.println(" -1 ");
                return;
            }
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
        //TC - O(n) 
        public static void postorder(Node root){
            if(root==null){
                System.out.println(" -1 ");
                return;
            }
            inorder(root.left);
            inorder(root.right);
            System.out.println(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }    
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height(Node root){
            if (root == null){
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh,rh) + 1;

        }   
    }
    
}
