package MiniCash;

public class BankAPIResult<T> {
    private final T data;            // 成功時のデータ (PlayerDataなど)
    private final String errorMsg;   // 失敗時のメッセージ
    private final boolean success;

    private BankAPIResult(T data, String errorMsg, boolean success) {
        this.data = data;
        this.errorMsg = errorMsg;
        this.success = success;
    }

    public static <T> BankAPIResult<T> success(T data) {
        return new BankAPIResult<>(data, null, true);
    }

    public static <T> BankAPIResult<T> error(String msg) {
        return new BankAPIResult<>(null, msg, false);
    }

    public boolean isSuccess() { return success; }
    public T getData() { return data; }
    public String getErrorMsg() { return errorMsg; }
}
