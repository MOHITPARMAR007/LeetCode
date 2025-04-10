/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Node LeftMostNode = root;
        while(LeftMostNode.left != null)
        {
         Node CurrentNode = LeftMostNode;
         while(CurrentNode != null)
         {
            CurrentNode.left.next= CurrentNode.right ;
            if(CurrentNode.next != null) 
            {
                CurrentNode.right.next = CurrentNode.next.left;
            }
            CurrentNode=CurrentNode.next;
         }
         LeftMostNode = LeftMostNode.left;
        } 
        return root ;
    }
}