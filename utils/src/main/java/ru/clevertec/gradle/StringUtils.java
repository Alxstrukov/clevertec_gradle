package ru.clevertec.gradle;

public class StringUtils {
    static boolean isPositiveNumber(String string) {
        Integer parseInt;
        try {
            parseInt = Integer.parseInt(string);
            if (parseInt > 0) return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.isPositiveNumber("88"));
    }
}
