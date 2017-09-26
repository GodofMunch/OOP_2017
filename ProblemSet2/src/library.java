public class library {
    public static void main(String[] args) {

        Book2 bk1 = new Book2();
        Book2 bk2 = new Book2("Ask and the Answer", "1234567890asd", 567, 5.99);


        System.out.print(bk1.toString());

        System.out.print(bk2.toString());
    }
}
