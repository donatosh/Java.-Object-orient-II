package Interfaces.Comparable.Task12;

import Interfaces.Clonable.House.House;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void setList(ArrayList<Object> list){
        this.list = list;
    }

    public ArrayList<Object> getList(){
        return this.list;
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override /** Переопределяет метод toString класса Object */
    public String toString() {
        return "стек: " + list.toString();
    }

    @Override
    public Object clone(){
        MyStack stackClone = new MyStack();
        stackClone.list = (ArrayList<Object>) this.list.clone();
        return stackClone;


        /*try {
            MyStack stackClone = (MyStack)super.clone();
            stackClone.list = (ArrayList<Object>) this.list.clone();

            return stackClone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }*/
    }
}
