package MiniCash;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) // 未知のフィールド（idなど）が来ても無視する設定

public class PlayerData {
    @JsonProperty("playerName")
    private String playerName;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("emoney")
    private int emoney;
    @JsonProperty("bank")
    private int bank;
    @JsonProperty("point")
    private int point;
    @JsonProperty("message")
    private String message;

    public PlayerData(){}

    public PlayerData(String playerName, String uuid, int emoney, int bank, int point, String message) {
        this.playerName = playerName;
        this.uuid = uuid;
        this.emoney = emoney;
        this.bank = bank;
        this.point = point;
        this.message = message;

    }

    public String getPlayerName(){
        return playerName;
    }

    public String getUuid(){
        return uuid;
    }

    public int getEmoney(){
        return emoney;
    }

    public int getBank(){
        return bank;
    }
    public int getPoint(){
        return point;
    }
    public String getMessage(){
        return message;
    }

}

