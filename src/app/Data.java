/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author User
 */
public abstract class Data {
     String desc;
     int amount;
     String date;
     
     Data(String desc, int amount, String date){
         this.desc = desc;
         this.amount = amount;
         this.date = date;
     }
     
    public abstract void setTotal(int total);
    public abstract int getTotal();
}
