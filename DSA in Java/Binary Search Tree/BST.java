public class BST{
    public static void main(String[] args) {
        int values[] = {1,1,1};    
        Node root = null;

        for (int i = 0; i < values.length ; i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        // System.out.println();
        // if(search(root,77 )){
        //     System.out.println("Found");
        // }else{
        //     System.out.println("Not Found");
        // }
        // System.out.println();

        // root = delete(root, 1);
        // inorder(root);

        // printInRange(root, 5, 12);

        if(isValidBST(root, null, null)){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }


    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    // public static Node insert(Node root, int val){
    //     if(root==null){
    //         root = new Node(val);
    //         return root;
    //     }

    //     if(root.data > val){
    //         root.left = insert(root.left, val);
    //     }
    //     if(root.data < val){
    //         root.right = insert(root.right, val);
    //     }
    //     return root;
    // }
    public static Node insert(Node root, int val) {
    if (root == null) {
        root = new Node(val);
        return root;
    }

    if (root.data > val) {
        root.left = insert(root.left, val);
    } else if (root.data < val) {
        root.right = insert(root.right, val);
    }
    // If root.data == val, ignore the duplicate
    return root;
}

    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }

        if(root.data==key){
            return true;
        }

        if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }

        
    }

    public static Node delete(Node root, int val){
        if(root.data<val){
            root.right = delete(root.right, val);
        }else if(root.data>val){
            root.left = delete(root.left, val);
        }else{
            //Case 01
            if(root.left==null && root.right == null){
                return null;
            }

            //Case 02
            if(root.left == null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            //Case 03 
            Node inSucc = findInorderSuccessor(root.right);
            root.data = inSucc.data;
            root.right = delete(root.right, inSucc.data);
            
            }

            return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left,k1,k2);
            System.out.println(root.data+" ");
            printInRange(root.right,k1,k2);
        }
        else if(root.data <k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }

    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min!=null && root.data<= min.data){
            return false;
        }
        else if( max!= null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);
    }
}

