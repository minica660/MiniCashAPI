package MiniCash;

public class PayResponseDTO {

    private String message;
    private String miniMessage;
    private PlayerData sender;
    private PlayerData receiver;


    public String getMessage() {
        return message;
    }

    public String getMiniMessage() {
        return miniMessage;
    }

    public PlayerData getSender() {
        return sender;
    }

    public PlayerData getReceiver() {
        return receiver;
    }


    public PayResponseDTO(String message, String miniMessage,PlayerData sender, PlayerData receiver) {
        this.message =  message;
        this.miniMessage = miniMessage;
        this.sender = sender;
        this.receiver = receiver;
    }

    public PayResponseDTO(){}

}
