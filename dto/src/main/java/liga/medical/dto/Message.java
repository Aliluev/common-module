package liga.medical.dto;

public class Message {

    private MessageType messageType;

    private String content;

    public Message(MessageType messageType, String content) {
        this.messageType = messageType;
        this.content = content;
    }

    public Message() {
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
