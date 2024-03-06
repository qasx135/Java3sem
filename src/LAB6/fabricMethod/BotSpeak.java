package LAB6.fabricMethod;

public class BotSpeak {
    private final SimpleBotSpeechFactory speechFactory;

    public BotSpeak(SimpleBotSpeechFactory speechFactory) {
        this.speechFactory = speechFactory;
    }

    public Message work(MessageType type) {
        Message msg = speechFactory.chooseTypeSpeech(type);
        msg.sayHi();
        msg.sayBy();
        System.out.println("Bot said all !!");
        return msg;
    }
}
