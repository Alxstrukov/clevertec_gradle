package ru.clevertec.gradle;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        for (String item : str) {
            if (StringUtils.isPositiveNumber(item)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"1", "2", "3"};
        System.out.println(isAllPositiveNumbers(strings));
    }
}
