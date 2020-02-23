package com.gy.queue;

public class QueueImplArray {

    private int[] array;

    private int front;

    private int rear;

    public QueueImplArray(int capacity) {
        this.array = new int[capacity];
    }

    public void enQueue(int element) {
        if((rear + 1) % array.length == front) {
            System.out.println("队列已满");
        }

        array[rear] = element;
        rear = (rear + 1) % array.length;
    }

    public int deQueue() {
        if(rear == front) {
            System.out.println("队列为空");
        }

        int deQueueElement = array[front];
        front = (front + 1) % array.length;
        return deQueueElement;
    }
}
