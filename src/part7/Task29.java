package part7;

public class Task29 {
    public static void main(String[] args) {
        String str = "Hello world, my name Vadim!";
        str = str.replaceAll("[!.,::-]", "");
        String[] words = str.split(" ");
        StringBuilder newStr = new StringBuilder();
        for(String word : words) {
            newStr.append(word.charAt(word.length()-1));
        }
        System.out.println(newStr);
    }
}
