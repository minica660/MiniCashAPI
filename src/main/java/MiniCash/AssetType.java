package MiniCash;

import java.util.Locale;

public enum AssetType {
    EMONEY,
    BANK,
    POINT;

    public String toKey() {
        return this.name().toLowerCase(Locale.ROOT);
    }
}
