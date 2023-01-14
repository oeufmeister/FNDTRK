/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class User {
    //DataPengeluaran datapengeluaran;
    //DataPendapatan datapendapatan;
    
    private ArrayList<DataPengeluaran> datPeng = new ArrayList<>();
    private ArrayList<DataPendapatan> datPend = new ArrayList<>();
    
    private int totalPend;
    private int totalPeng;
    private int budget = 0;
    
    public ArrayList<DataPengeluaran> getArrPeng(){
        return this.datPeng;
    }
    
    public ArrayList<DataPendapatan> getArrPend(){
        return this.datPend;
    }
    
    public void setTotalPend(int total){
        this.totalPend += total;
    }
    
    public void setTotalPeng(int total){
        this.totalPeng += total;
    }
    
    public void setBudget(int budget){
        this.budget = budget;
    }
    
    public int getTotalPeng(){
        return this.totalPeng;
    }
    
    public int getTotalPend(){
        return this.totalPend;
    }
    
    public int getBudget(){
        return this.budget;
    }
    
    public void setDatapendapatan(DataPendapatan p){
        this.datPend.add(p);
    }
    
    public void setDatapengeluaran(DataPengeluaran p){
        //this.datapengeluaran = p;
        this.datPeng.add(p);
    }
}
