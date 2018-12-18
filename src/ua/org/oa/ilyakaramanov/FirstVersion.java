package ua.org.oa.ilyakaramanov;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstVersion {

    public static void main(String[] args) {

        String text = "Я приближался к месту моего назначения. Вокруг меня, прижимаясь к самой дороге, зеленел лес, " +
                "изредка уступая место полянам, поросшим жёлтой осокою. Солнце садилось уже который час, всё никак " +
                "не могло сесть и висело низко над горизонтом. Машина катилась по узкой дороге, засыпанной хрустящим " +
                "гравием. Крупные камни я пускал под колесо, и каждый раз в багажнике лязгали и громыхали пустые канистры.";

        List<String> sentences = Arrays.asList(text.split("[.!?]")); //Добавляю предложения в массив
        List<String> trimmedSentences = new ArrayList<>();
        for (int i = 0; i < sentences.size(); i++) {
            trimmedSentences.add(sentences.get(i).trim());       //Обрезаю лишние пробелы и формирую новый массив
        }

        /* Сортирую предложения по количеству слов
         * */
        for (int i = trimmedSentences.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (trimmedSentences.get(j).split(" ").length > trimmedSentences.get(j + 1).split(" ").length) {
                    String temp = trimmedSentences.get(j);
                    trimmedSentences.set(j, trimmedSentences.get(j + 1));
                    trimmedSentences.set((j + 1), temp);
                }
            }
        }

        for (String s : trimmedSentences) {
            System.out.println(s);
        }

    }
}