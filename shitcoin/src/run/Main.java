/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import Model.BlockChain.ShitCoin;
import Model.DataTransaction;
import Model.ReceiverMoney;
import Model.SourceMoney;
import Model.StaticEncrypt;
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
public class Main {

    public static void main(String[] args) {
        ShitCoin shitCoin = new ShitCoin();
        shitCoin.addNewBlock(new DataTransaction(2, "tst02", new SourceMoney("Ngân Hàng Á Châu", "ACB", "DO QUANG ANH", "1902934", "10000000"),
                new ReceiverMoney("Kỹ Thương", "TCB", "DAO VA", "2029384"), "10/07/2022", "hom qua em tuyet lam"));
        shitCoin.addNewBlock(new DataTransaction(3, "tst03", new SourceMoney("Ngân Hàng Quân Đội", "MB", "HA QUYNH ANH", "232934", "2300000"),
                new ReceiverMoney("Công Thương", "MVN", "HA TIEN ANH", "23184"), "21/01/2021", "hom qua em ngon lam"));
        shitCoin.addNewBlock(new DataTransaction(4, "tst04", new SourceMoney("Ngân Hàng Cổ Phần Công Thương", "VCB", "NGUYEN TRUONG TO", "2312934", "14300000"),
                new ReceiverMoney("Kỹ Thương", "TCB", "DO MINH ANH", "1902323"), "12/02/2019", "hihi"));
//         shitCoin.addNewBlock(new DataTransaction(5, "tst05", new SourceMoney("Ngân Hàng Cổ Phần Công Thương", "VCB", "NGUYEN TRUONG", "23134334", "1422000"),
//                new ReceiverMoney("Kỹ Thương", "TCB", "DO QUANG ANH", "1902934"), "12/02/2022", "hom qua em den lam"));
//          shitCoin.addNewBlock(new DataTransaction(6, "tst06", new SourceMoney("Ngân Hàng Cổ Phần Công Thương", "VCB", "BE XINH", "23143434", "132700"),
//                new ReceiverMoney("Ngân Hàng Quân Đội", "MB", "HA ANH", "19012334"), "12/02/2022", "hom qua em den lam"));
           shitCoin.printlnAllBlock();
       shitCoin.isHacked();
        System.out.println("");
//        shitCoin.getList().get(2).setTransactionId("tst222222222");
//        shitCoin.printlnAllBlock();
//       shitCoin.isHacked();
           
       
    }
}
