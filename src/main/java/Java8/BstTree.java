package Java8;

import java.util.ArrayList;
import java.util.List;

public class BstTree {
    //数据结构
    static class TreeNode{
        int val;
        TreeNode leftNode;
        TreeNode rightNode;
        public TreeNode(int val){
            this.val = val;
        }
    }
    //根节点
    TreeNode root;
    //增
    public void insert(int val){
        root = insertBST(root,val);
    }
    public TreeNode insertBST(TreeNode treeNode , int val){
        if(treeNode==null){
            treeNode = new TreeNode(val);
        }
        if(val>treeNode.val){
            treeNode.rightNode = insertBST(treeNode.rightNode,val);
        }else if (val<treeNode.val){
            treeNode.leftNode = insertBST(treeNode.leftNode,val);
        }
        return treeNode;
    }
    //最小节点
    private TreeNode findLeft(TreeNode node){
        while(node.leftNode!=null){
            node = node.leftNode;
        }
        return node;
    }
    //中序 左根右
    public void inOrder(){
        List<Integer> list = new ArrayList();
        this.inOrder(root,list);
        System.out.println(list);
    }
    private void inOrder(TreeNode root,List list){
        if(root.leftNode!=null){
            inOrder(root.leftNode,list);
        }
        list.add(root.val);
        if(root.rightNode!=null){
            inOrder(root.rightNode,list);
        }
    }
    //搜索
    public int searchBST(int val){
        TreeNode node = searchBST(root,val);
        return node!=null?node.val:-1;
    }
    private TreeNode searchBST(TreeNode treeNode ,int val){
        if(treeNode==null || val==treeNode.val){
            return treeNode;
        }
        if(val<treeNode.val){
            return searchBST(treeNode.leftNode,val);
        }else {
            return searchBST(treeNode.rightNode,val);
        }

    }
    //删除
    public void deleteNode(int val) {
        root = deleteNode(root, val);
    }
    // 0. 待删除节点为根节点
    // 1. 待删除节点无左孩子，用右孩子替代删除节点
    // 2. 待删除节点无右孩子，用左孩子替代删除节点
    // 3. 待删除节点既有右孩子又有左孩子，找到右子树的最小值替换待删除节点，然后删除右子树最小值
    private TreeNode deleteNode(TreeNode node,int val){
        if(node==null){
            return null;
        }
        if(val<node.val){
            node.leftNode = deleteNode(node.leftNode,val);
        }else if(val>node.val){
            node.rightNode = deleteNode(node.rightNode,val);
        }else{
            if(node.leftNode==null){
                return node.rightNode;
            }else if(node.rightNode==null){
                return node.leftNode;
            }else {
                TreeNode minNode = findLeft(node.rightNode);
                node.val = minNode.val;
                node.rightNode = deleteNode(node.rightNode,node.val);
            }
        }
        return node;
    }


    public static void main(String[] args) {
        BstTree bstTree = new BstTree();
        bstTree.insert(5);
        bstTree.insert(6);
        bstTree.insert(7);
        bstTree.insert(4);
        bstTree.insert(3);
        bstTree.inOrder();
        System.out.println(bstTree.root.val);
        bstTree.deleteNode(5);
        System.out.println(bstTree.root.val);
        bstTree.deleteNode(6);
        System.out.println(bstTree.root.val);
        bstTree.inOrder();

    }
}
