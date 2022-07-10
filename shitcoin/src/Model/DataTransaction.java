/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class DataTransaction {

    private int blockCount;
    private String preHash;
    private String Hash;
    private String transactionId;
    private SourceMoney nguoiChuyenTien;
    private ReceiverMoney nguoiNhanTien;
    private String transactionDateTime;
    private String detailTransaction;

    public DataTransaction() {
    }

    public DataTransaction(int blockCount, String transactionId, SourceMoney nguoiChuyenTien, ReceiverMoney nguoiNhanTien, String transactionDateTime, String detailTransaction) {
        this.blockCount = blockCount;
        this.transactionId = transactionId;
        this.nguoiChuyenTien = nguoiChuyenTien;
        this.nguoiNhanTien = nguoiNhanTien;
        this.transactionDateTime = transactionDateTime;
        this.detailTransaction = detailTransaction;
        this.Hash=calculHash();
    }

    public int getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(int blockCount) {
        this.blockCount = blockCount;
    }

    public String getPreHash() {
        return preHash;
    }

    public void setPreHash(String preHash) {
        this.preHash = preHash;
    }

    public String getHash() {
        return Hash;
    }

    public void setHash(String Hash) {
        this.Hash = Hash;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public SourceMoney getNguoiChuyenTien() {
        return nguoiChuyenTien;
    }

    public void setNguoiChuyenTien(SourceMoney nguoiChuyenTien) {
        this.nguoiChuyenTien = nguoiChuyenTien;
    }

    public ReceiverMoney getNguoiNhanTien() {
        return nguoiNhanTien;
    }

    public void setNguoiNhanTien(ReceiverMoney nguoiNhanTien) {
        this.nguoiNhanTien = nguoiNhanTien;
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public String getDetailTransaction() {
        return detailTransaction;
    }

    public void setDetailTransaction(String detailTransaction) {
        this.detailTransaction = detailTransaction;
    }

    private String calculHash() {
        return "00" + blockCount + "-PK-" + nguoiChuyenTien.toString() + "-FK-" + nguoiNhanTien.toString() + "-FK-" + transactionDateTime + "-" + "{" + detailTransaction + "}" + "-" + transactionId;
    }

    @Override
    public String toString() {
        return "DataTransaction{" + "blockCount=" + blockCount + ", preHash= " + preHash + "********* Hash= " + Hash +"}";
    }

}
