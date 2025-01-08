package week03.CustomDate;

public class CustomTimeTest {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime(14, 30, 45);
        CustomTime time2 = new CustomTime(5, 15, 0);
        CustomTime time3 = new CustomTime(23, 45);

        System.out.println(time1.toUniversalString());
        System.out.println(time2.toUniversalString());
        System.out.println(time3.toUniversalString());

        System.out.println(time1.toStandardString());
        System.out.println(time2.toStandardString());
        System.out.println(time3.toStandardString());
    }
}
