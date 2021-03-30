package com.leo.testEngland;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class Second {
    public static void main(String[] args) {
        Second s = new Second();
        s.g("abcdefgh").next();
        System.out.println(s.f("abcdefgh").next());
    }
    Iterator< Character > f(String s) {
        Stack< Character > S = new Stack < Character >();
        for (int i = 0; i < s. length (); i ++) {
            if (i % 2 != 0) {
                S. push ( s. charAt (i ));
            }
        }
        return S. iterator ();
    }
    Iterator < Character > g( String s) {
        Queue< Character > Q = new Queue<Character>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Character> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Character character) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Character> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public boolean offer(Character character) {
                return false;
            }

            @Override
            public Character remove() {
                return null;
            }

            @Override
            public Character poll() {
                return null;
            }

            @Override
            public Character element() {
                return null;
            }

            @Override
            public Character peek() {
                return null;
            }
        };
        for (int i = 0; i < s. length (); i ++) {
            if (i % 2 == 0) {
                Q.add (s. charAt (i ));
            }
        }
        return Q. iterator ();
    }

}
