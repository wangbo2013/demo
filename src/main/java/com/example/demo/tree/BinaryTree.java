package com.example.demo.tree;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @atuthor: mac
 * Create:  2020-04-20  11:24
 * Email: wangbo@unicloud.com
 */
public class BinaryTree {

    public String preorderRecursion(Tree root){
        if (root == null) {
            return "";
        }

        List<String> list = new ArrayList<>();
        preorderRecursion(root, list);
        return list.stream().collect(Collectors.joining(" "));
    }

    private List<String> preorderRecursion(Tree root, List<String> list){
        list.add(root.data);
        if (root.leftTree != null) {
            preorderRecursion(root.leftTree, list);
        }

        if (root.rightTree != null) {
            preorderRecursion(root.rightTree, list);
        }

        return list;
    }
}
