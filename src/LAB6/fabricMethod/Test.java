package LAB6.fabricMethod;

public class Test {
    public static void main(String[] args) {
        SimpleBotSpeechFactory initBotFactory = new SimpleBotSpeechFactory();
        BotSpeak bot = new BotSpeak(initBotFactory);
        bot.work(MessageType.ENGLISH);
    }
}
