package MiniCash;

public class BankAPIResult<T> {

    public enum Status {
        SUCCESS,            // Web API処理成功やJSONバースの成功(isSuccess = true)
        PARSE_ERROR,        // JSONバースのエラー(isSuccess = false)
        INSUFFICIENT_FUNDS, // 残高不足 (isSuccess = false)
        API_ERROR,          // Web API側でエラー返却（isSuccess = false）
        NETWORK_ERROR       // 通信エラー
    }

    private final T data;            // 成功時のデータ (PlayerDataなど)
    private final String errorMsg;   // 失敗時のメッセージ
    private final Status status;

    private BankAPIResult(T data, String errorMsg, Status status) {
        this.data = data;
        this.errorMsg = errorMsg;
        this.status = status;
    }

    public static <T> BankAPIResult<T> success(T data) {
        return new BankAPIResult<>(data, null, Status.SUCCESS);
    }

    // JSONパースエラー時（Web API側のDB処理は完了しているためロールバック不可）
    public static <T> BankAPIResult<T> parseError(String msg) {
        return new BankAPIResult<>(null, msg, Status.PARSE_ERROR);
    }

    public static <T> BankAPIResult<T> insufficientFunds(String msg) {
        return new BankAPIResult<>(null, msg, Status.INSUFFICIENT_FUNDS);
    }

    public static <T> BankAPIResult<T> error(String msg) {
        return new BankAPIResult<>(null, msg, Status.API_ERROR);
    }

    public static <T> BankAPIResult<T> networkError(String msg) {
        return new BankAPIResult<>(null, msg, Status.NETWORK_ERROR);
    }

    public boolean isSuccess(){
        return status == Status.SUCCESS;
    }

    public boolean isParseError(){
        return status == Status.PARSE_ERROR;
    }

    public Status getStatus(){
        return status;
    }

    public T getData(){
        return data;
    }

    public String getErrorMsg() {
        return errorMsg;
    }


    /**
     * Web API側で処理（DB更新）自体が完了しているかどうか
     * (PARSE_ERRORの際にロールバックを行わない判定に使用)
     */
    public boolean isExecutedOnServer() {
        return status == Status.SUCCESS || status == Status.PARSE_ERROR;
    }


}
