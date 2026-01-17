package filehandlingandsearch;

public class SearchWordInSentences {
    public static void main(String[] args) {

        String[] sentences = {
                "Java is very powerful",
                "Linear search is easy"};

        String word = "search";
        String result = "Not Found";

        // Linear search
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].toLowerCase().contains(word.toLowerCase())) {
                result = sentences[i];
                break;
            }
        }

        System.out.println(result);
    }
}
