package com.gy.stack;

import com.gy.list.List;

public class StackImplList {

    // 栈顶
    private int top;

    private List list;

    public StackImplList() {
        this.top = -1;
        this.list = new List();
    }

    public int pop() {
        if(top == -1) {
            System.out.println("栈是空的");
            return -100;
        }

        int value = list.getValue(top);
        list.remove(top);
        top--;
        return value;
    }

    public boolean push(int i) {
        top++;
        list.insert(i, top);
        return true;
    }

    public static void main(String[] args) {
        StackImplList stackImplList = new StackImplList();
        stackImplList.push(0);
        stackImplList.push(1);
        stackImplList.push(2);
        stackImplList.push(3);
        stackImplList.push(4);

        int pop = stackImplList.pop();
        System.out.println(pop);

        System.out.println("=========");
        pop = stackImplList.pop();
        System.out.println(pop);

        System.out.println("=========");
        pop = stackImplList.pop();





        System.out.println(pop);

        System.out.println("=========");

        stackImplList.list.output();
    }
}
