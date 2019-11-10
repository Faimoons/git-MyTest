package Home1Work.Dybrovin;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        System.out.println("Введите предложение:");
        Scanner scanner = new Scanner(System.in);
        String sentence = "ihy.jh)kg!to;kvjh";
        char[] sentenceArray = sentence.toCharArray();

        char[] punctuation = {'.',',',':',';','!','?','-','–','"','«','»','(',')','/'};
        int count = 0;

        for (int i = 0; i < sentenceArray.length; i++) {
            for (int j = 0; j < punctuation.length; j++) {
                if (sentenceArray[i] == punctuation[j]) {
                    count = count + 1;
                }
            }
        }
        System.out.println("Количество знаков препинания в строке: " + count);
    }
}
