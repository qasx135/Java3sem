package LAB6.abstractFabric;

public abstract class BotSpeak {

    protected abstract Message makeSpeech(MessageType type);

    public Message work(MessageType type) {
        Message msg = makeSpeech(type);
        msg.sayHi();
        msg.sayBy();
        System.out.println("Bot said all !!");
        return msg;
    }
}
