package com.gy.stack;

public class StackImplArray {
    // 数组方式实现栈
    private int top;
    private int capacity;
    private Object [] array;
    public StackImplArray(){
        top = -1;//栈顶指针为-1
        capacity = 5;//初始化容量的大小
        array = new Object[capacity];//初始化数组
    }

    public static void main(String[] args) {
        StackImplArray stack = new StackImplArray();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        Object pop = stack.pop();
        System.out.println(pop);
        stack.showAll();
    }

    public boolean isEmpty(){//判断是否为空
        return top == -1;
    }

    public boolean isFull(){//判断是否是满栈的
        return top == capacity - 1;
    }

    // 出栈
    public Object pop() {
        if(isEmpty()) {
            System.out.println("栈是空的");
            return -100;
        }
        Object value = array[top];
        array[top] = null;
        top--;
        return value;
    }

    //对栈进行扩容（每次扩容一倍）
    public void expand(Object o) {
        Object[] largerArr = new Object[capacity * 2];
        for (int index = 0; index <= top; index++) {
            largerArr[index] = array[index];
        }
        array = largerArr;
        top++;
        array[top] = o;
        capacity = array.length;
    }

    // 入栈
    public boolean push(Object o) {
        if(isFull()) {
            expand(o);
            return true;
        } else {
            top++;
            array[top] = o;
            return true;
        }

    }

    public void showAll() {//显示栈中所有的值
        for (int i = top; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }
    }
}
