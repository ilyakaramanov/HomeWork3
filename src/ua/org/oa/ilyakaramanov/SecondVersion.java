package ua.org.oa.ilyakaramanov;


public class SecondVersion {

    public static void main(String[] args) {
        String text = "Я приближался к месту моего назначения. Вокруг меня, прижимаясь к самой дороге, зеленел лес, " +
                "изредка уступая место полянам, поросшим жёлтой осокою. Солнце садилось уже который час, всё никак " +
                "не могло сесть и висело низко над горизонтом. Машина катилась по узкой дороге, засыпанной хрустящим " +
                "гравием. Крупные камни я пускал под колесо, и каждый раз в багажнике лязгали и громыхали пустые канистры.";

        String[] sentences = text.split("[.!?]");                   //Добавляю предложения в массив
        String[] trimmedSentences = new String[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            trimmedSentences[i] = sentences[i].trim();               //Обрезаю лишние пробелы и формирую новый массив
        }

        /* Сортирую предложения по количеству слов
         * */

        boolean sort = false;
        String temp;
        while (!sort) {
            sort = true;
            for (int i = 0; i < trimmedSentences.length - 1; i++) {
                if (trimmedSentences[i].split(" ").length > trimmedSentences[i + 1].split(" ").length) {
                    sort = false;
                    temp = trimmedSentences[i];
                    trimmedSentences[i] = trimmedSentences[i + 1];
                    trimmedSentences[i + 1] = temp;
                }
            }
        }

        for (String s : trimmedSentences) {
            System.out.println(s);
        }

    }
}



