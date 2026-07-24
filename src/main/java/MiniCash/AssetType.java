package MiniCash;

import java.util.Locale;

public enum AssetType {
    EMONY,
    BANK,
    POINT;

    public String toKey() {
        return this.name().toLowerCase(Locale.ROOT);
    }
}
