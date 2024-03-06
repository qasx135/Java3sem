package LAB6.abstractFabric;

public class SaySimpleWords extends BotSpeak{
    @Override
    protected Message makeSpeech(MessageType type) {
        Message msg = null;
        switch (type) {
            case RUSSIAN -> msg = new Russian();
            case ENGLISH -> msg = new English();
        }
        return msg;
    }
}
