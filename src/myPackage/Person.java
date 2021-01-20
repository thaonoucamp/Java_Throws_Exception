package myPackage;

import javax.naming.InsufficientResourcesException;

public class Person {
    public static void print() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2};

        System.out.println(arr[2]);
    }

    public static void excep() {
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void exception() throws InsufficientResourcesException {
        throw new InsufficientResourcesException();
    }

    public static void main(String[] args) {
        try {
            print();
        } catch (Exception e) {
            System.out.println("e");
        }

        try {
            excep();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("loi");
        }

        try {
            exception();
        } catch (InsufficientResourcesException e) {
            System.out.println("loi 2");
        }
    }
}
// throws tai Ham khai bao (yes) try_catch;

// throws tai Ham main (no) can try_catch;

// tao truc tiep (Obj) throw trong Ham (yes) try_catch;