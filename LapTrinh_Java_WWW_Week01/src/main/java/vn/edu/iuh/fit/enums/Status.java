package vn.edu.iuh.fit.enums;

public enum Status {
    ACTIVE(1), DEACTIVE(0),DELETE(-1);
    private final int code;
    Status(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    public static Status fromCode(int code) throws IllegalAccessError {
        for (Status status : Status.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalAccessError("Invalid code: " + code);
    }
}
