public class Tsubuyaki {
    private String message;
    private String timestamp;

    // コンストラクタ
    public Tsubuyaki(String message, String timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    // messageのゲッター
    public String getMessage() {
        return message;
    }

    // timestampのゲッター
    public String getTimestamp() {
        return timestamp;
    }

    // セッターが必要な場合は以下を追加
    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
