/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class SourceMoney {

    private String bankName;
    private String bankNickName;
    private String accountName;
    private String accountId;
    

    public SourceMoney() {
    }

    public SourceMoney(String bankName, String bankNickName, String accountName, String accountId) {
        this.bankName = bankName;
        this.bankNickName = bankNickName;
        this.accountName = accountName;
        this.accountId = accountId;
     
    }

   

    public String getBankNickName() {
        return bankNickName;
    }

    public void setBankNickName(String bankNickName) {
        this.bankNickName = bankNickName;
    }

    public String getBankName() {
        return bankNickName;
    }

    public void setBankName(String bankNickName) {
        this.bankNickName = bankNickName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return bankNickName + "-" + accountId + "-";
    }

}
