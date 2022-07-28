public class main_Class {
    public static void main(String[] args) {
        // output for Outer_Demo.java
        Outer_Demo outer = new Outer_Demo();

        outer.display_Inner();

        // to access for a non static class Outer_Demo02.java
        // instantiating the Outer_Demo02
        Outer_Demo02 outer02 = new Outer_Demo02();

        // instantiating the inner class(a non-static class) to access a private member
        Outer_Demo02.inner_Class inner = outer02.new inner_Class();
        System.out.println(inner.getNum());

    }
}
