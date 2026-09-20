package MiniCash.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoneyLog {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("accessTime")
    private String accessTime;

    @JsonProperty("playerName")
    private String playerName;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("user")
    private String user;

    @JsonProperty("server")
    private String server;

    @JsonProperty("pluginName")
    private String pluginName;

    @JsonProperty("content")
    private String content;

    @JsonProperty("displayContent")
    private String displayContent;

    @JsonProperty("type")
    private String type;

    @JsonProperty("action")
    private String action;

    @JsonProperty("amount")
    private int amount;

    public MoneyLog() {
    }

    public Long getId() {
        return id;
    }

    public String getAccessTime() {
        return accessTime;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getUuid() {
        return uuid;
    }

    public String getUser() {
        return user;
    }

    public String getServer() {
        return server;
    }

    public String getPluginName() {
        return pluginName;
    }

    public String getContent() {
        return content;
    }

    public String getDisplayContent() {
        return displayContent;
    }

    public String getType() {
        return type;
    }

    public String getAction() {
        return action;
    }

    public int getAmount() {
        return amount;
    }

}
