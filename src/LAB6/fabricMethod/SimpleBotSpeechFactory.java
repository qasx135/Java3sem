package LAB6.fabricMethod;

public class SimpleBotSpeechFactory {
    public Message chooseTypeSpeech(MessageType type) {
        Message msg = null;
        switch (type) {
            case RUSSIAN -> msg = new Russian();
            case ENGLISH -> msg = new English();
        }

        return msg;
    }
}
