package com.example.demo.tree;

import lombok.Data;

/**
 * @atuthor: mac
 * Create:  2020-04-20  11:24
 * Email: wangbo@unicloud.com
 */
@Data
public class Tree {

    String data;
    Tree leftTree;
    Tree rightTree;

    public Tree(String x) {
        data = x;
    }
}
