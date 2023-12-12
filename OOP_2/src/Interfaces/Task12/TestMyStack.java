package Interfaces.Task12;

import java.math.BigDecimal;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(new BigDecimal(1));
        stack.push(new BigDecimal(2));
        stack.push(new BigDecimal(3));
        System.out.println(stack.hashCode());
        System.out.println(stack.getList().hashCode());

        MyStack stackClone = new MyStack();
        stackClone = (MyStack) stack.clone();
        stackClone.push(new BigDecimal(4));
        System.out.println(stackClone.hashCode());
        System.out.println(stackClone.getList().hashCode());
    }
}
