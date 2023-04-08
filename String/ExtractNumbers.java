public class ExtractNumbers {
    public static void main(String[] args) {
        String s = "This is a string with numbers 123 and 456.789";
        String  nums = s.replaceAll("[^0-9\\.]", "");
        nums = nums.trim();
        System.out.println(nums);
    }
}
