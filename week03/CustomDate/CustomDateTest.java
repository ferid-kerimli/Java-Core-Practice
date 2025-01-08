package week03.CustomDate;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate firstDate = new CustomDate(2, 10, 2024);
        CustomDate secondDate = new CustomDate(3, 15, 2023);

        firstDate.displayDate();
        secondDate.displayDate();

        System.out.println("Difference in days: " + firstDate.difference(secondDate));
        
        System.out.println("Comparison result: " + CustomDate.compare(firstDate, secondDate));

        firstDate.displayFormatted();
        secondDate.displayFormatted();
    }
}
