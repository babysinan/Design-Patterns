package com.huang.composite;

/**
 * Created by hlp on 2017/4/17.
 */
public class Tree {
    TreeNode root=null;
    public Tree(String name){
        root=new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree nodea=new Tree("nodea");
        TreeNode nodeb=new TreeNode("nodeb");
        TreeNode nodec=new TreeNode("nodec");
        nodeb.add(nodec);
        nodea.root.add(nodeb);
        System.out.println("build the tree finished!");
    }
}
