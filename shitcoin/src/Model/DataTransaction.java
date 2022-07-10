/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

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
    private int remakeHashKey = 0;
    private int difficult = 5;

    public DataTransaction() {
    }

    public DataTransaction(int blockCount, String transactionId, SourceMoney nguoiChuyenTien, ReceiverMoney nguoiNhanTien, String transactionDateTime, String detailTransaction) {
        this.blockCount = blockCount;
        this.transactionId = transactionId;
        this.nguoiChuyenTien = nguoiChuyenTien;
        this.nguoiNhanTien = nguoiNhanTien;
        this.transactionDateTime = transactionDateTime;
        this.detailTransaction = detailTransaction;
        try {
            this.Hash = calculHash();
            this.Hash = mineMachine(difficult);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(int blockCount) {
        this.blockCount = blockCount;
        try {
            this.Hash = mineMachine(difficult);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getPreHash() {
        return preHash;
    }

    public void setPreHash(String preHash) {
        this.preHash = preHash;
        try {
            this.Hash = mineMachine(difficult);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            this.Hash = mineMachine(difficult);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public SourceMoney getNguoiChuyenTien() {
        return nguoiChuyenTien;
    }

    public void setNguoiChuyenTien(SourceMoney nguoiChuyenTien) {
        this.nguoiChuyenTien = nguoiChuyenTien;
        try {
            this.Hash = mineMachine(difficult);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ReceiverMoney getNguoiNhanTien() {
        return nguoiNhanTien;
    }

    public void setNguoiNhanTien(ReceiverMoney nguoiNhanTien) {
        this.nguoiNhanTien = nguoiNhanTien;
        try {
            this.Hash = mineMachine(difficult);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
        try {
            this.Hash = mineMachine(difficult);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDetailTransaction() {
        return detailTransaction;
    }

    public void setDetailTransaction(String detailTransaction) {
        this.detailTransaction = detailTransaction;
        try {
            this.Hash = mineMachine(difficult);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(DataTransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String mineMachine(int difficult) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        String s = "";
        for (int i = 0; i < difficult; i++) {
            s += "0";
        }
        while (!this.Hash.substring(0, difficult).endsWith(s)) {
            remakeHashKey++;
            this.Hash = calculHash();
        }
        return this.Hash;
    }

    private String calculHash() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        String temp = blockCount + preHash + transactionId + nguoiChuyenTien.toString() + nguoiNhanTien.toString() + transactionDateTime + detailTransaction + remakeHashKey;
        return Sha256.sha256(temp);

    }

    @Override
    public String toString() {
        return this.preHash + "\n" + this.Hash;
    }

}
