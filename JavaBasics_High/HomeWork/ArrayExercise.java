package JavaBasics_High.HomeWork;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author tor
 * @Date 2024/1/23 20:25
 * @PackageName:JavaBasics_High.HomeWork
 * @Description:
 * @Version 1.0
 */
public class ArrayExercise {
    public void book() {
        Book[] books = new Book[4];
        books[0] = new Book("西游记", 10.0);
        books[1] = new Book("水浒传", 12.0);
        books[2] = new Book("红楼梦", 15.0);
        books[3] = new Book("三国演戏", 18.0);

        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                // > 从小到大; < 从大到小
                if (books[j].price < books[j+1].price) {
                    Book temp = books[j];
                    books[j] = books [j+1];
                    books[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(books));
    }
        public void book2(Comparator c) {
            Book[] books = new Book[4];
            books[0] = new Book("西游记", 10.0);
            books[1] = new Book("水浒传", 12.0);
            books[2] = new Book("红楼梦", 15.0);
            books[3] = new Book("三国演戏", 18.0);

            for (int i = 0; i < books.length; i++) {
                for (int j = 0; j < books.length - 1 - i; j++) {
                    // 由compare方法决定排序顺序
                    if (c.compare(books[j].price,books[j+1].price) > 0) {
                        Book temp = books[j];
                        books[j] = books [j+1];
                        books[j+1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(books));
        }

    public static class Book {
        String name;
        double price;

        public Book(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}