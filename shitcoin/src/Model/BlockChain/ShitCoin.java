/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.BlockChain;

import Model.DataTransaction;
import Model.ReceiverMoney;
import Model.SourceMoney;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ShitCoin {

    private List<DataTransaction> _chain;

    public ShitCoin() {
        _chain = new ArrayList<>();
        _chain.add(new DataTransaction(1, "ts01", new SourceMoney("1", "1", "1", "1"), new ReceiverMoney("1", "1", "1", "1"), "10/07/2022", "10","Create Chain"));
    }

    public List<DataTransaction> getList() {
        return _chain;
    }

    private DataTransaction getLastestBlock() {
        return _chain.get(_chain.size() - 1);
    }

    public void addNewBlock(DataTransaction d) {
        d.setPreHash(getLastestBlock().getHash());
        _chain.add(d);
    }

    public void printlnAllBlock() {
        for (DataTransaction dataTransaction : _chain) {
            System.out.println(dataTransaction.toString());
            System.out.println("");
        }
    }

    public boolean isHacked() {
        boolean valid = true;
        for (int i = 1; i < _chain.size(); i++) {
            if (!(_chain.get(i).getPreHash().equals(_chain.get(i - 1).getHash()))) {
                System.out.println("PreHas Block " + _chain.get(i).getBlockCount() + " is not equal Hash Block " + _chain.get(i - 1).getBlockCount());
                valid = false;
            }
        }
        if(!valid){
            System.out.println("Hacked");
        }
        return valid;
    }
}
