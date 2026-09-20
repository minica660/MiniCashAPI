package MiniCash.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoneyLogPageResponseDTO {


    @JsonProperty("logs")
    private List<MoneyLog> logs;

    @JsonProperty("currentPage")
    private int currentPage;

    @JsonProperty("totalPages")
    private int totalPages;

    @JsonProperty("totalElements")
    private long totalElements;

    @JsonProperty("hasNext")
    private boolean hasNext;

    public MoneyLogPageResponseDTO() {
    }

    public List<MoneyLog> getLogs() {
        return logs;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public boolean isHasNext() {
        return hasNext;
    }

}
