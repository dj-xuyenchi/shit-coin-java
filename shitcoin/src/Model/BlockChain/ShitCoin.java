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
        _chain.add(new DataTransaction(1, "", new SourceMoney("", "", "", "", "0"), new ReceiverMoney("", "", "", ""), "10/07/2022", "Create Chain"));
    }

    public List<DataTransaction> getList() {
        return _chain;
    }

    private DataTransaction getLastestBlock() {
        return _chain.get(_chain.size()-1);
    }

    public void addNewBlock(DataTransaction d) {
        d.setPreHash(getLastestBlock().getHash());
        _chain.add(d);
    }
    public void printlnAllBlock(){
        for (DataTransaction dataTransaction : _chain) {
            System.out.println(dataTransaction.toString());
        }
    }
    public boolean isHacked(){
        for (int i = 1; i < _chain.size()-1; i++) {
            if(!(_chain.get(i).getPreHash().equals(_chain.get(i-1).getHash()))){
                return false;
            }
        }
        return true;
    }
}
