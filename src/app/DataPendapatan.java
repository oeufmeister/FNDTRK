/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author User
 */
public class DataPendapatan extends Data {
    int Total = 0;
    
    public DataPendapatan(String desc, int amount, String date){
        super(desc,amount,date);
    }
    
    @Override
    public void setTotal(int total){
        this.Total += total;
    }
    @Override
    public int getTotal(){
        return this.Total;
    }
}