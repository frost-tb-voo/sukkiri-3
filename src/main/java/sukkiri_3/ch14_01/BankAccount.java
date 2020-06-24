package sukkiri_3.ch14_01;

import java.util.Objects;

public class BankAccount {
    private String accountNumber;
    private int balance;

    public String toString() {
        return "￥" + this.balance + "(口座番号＝" + this.accountNumber + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankAccount)) {
            return false;
        }
        BankAccount another = (BankAccount) obj;
        if (this.accountNumber != null && another.accountNumber != null) {
            if (!this.accountNumber.trim().equals(another.accountNumber.trim())) {
                return false;
            }
        } else {
            if (this.accountNumber != another.accountNumber) {
                return false;
            }
        }
        return true;
    }
    
}