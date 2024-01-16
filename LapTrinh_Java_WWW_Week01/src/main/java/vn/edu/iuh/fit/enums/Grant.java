package vn.edu.iuh.fit.enums;

public enum Grant {
    diasable(0), enable(1);
    private final int code;
    Grant(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public static Grant fromCode(int code) throws IllegalAccessError {
        for (Grant grant : Grant.values()) {
            if (grant.getCode() == code) {
                return grant;
            }
        }
        throw new IllegalAccessError("Invalid code: " + code);
    }
}
