package LAB6.abstractFabric;

public class Test {
    public static void main(String[] args) {
        BotSpeak botSimpleWords = new SaySimpleWords();
        botSimpleWords.work(MessageType.ENGLISH);

        BotSpeak botLongWords = new SayLongWords();
        botLongWords.work(MessageType.RUSSIAN_LONG);
    }
}
