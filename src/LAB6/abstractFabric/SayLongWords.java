package LAB6.abstractFabric;

public class SayLongWords extends BotSpeak {
    @Override
    protected Message makeSpeech(MessageType type) {
        Message msg = null;
        switch (type) {
            case RUSSIAN_LONG -> msg = new RussianLong();
            case ENGLISH_LONG -> msg = new EnglishLong();
        }
        return msg;
    }
}
