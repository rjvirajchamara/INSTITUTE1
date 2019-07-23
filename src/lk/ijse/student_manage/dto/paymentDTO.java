/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.student_manage.dto;

/**
 *
 * @author Expression chamara is undefined on line 12, column 14 in
 * Templates/Classes/Class.java.
 */
public class paymentDTO extends SuperDTO {

    private String PID;
    private String RID;
    private String PaID;
    private String fee;
    private String Ptype;
    private String Discount;
    private String Gon_rate;
    private String Gon_tax;
    private String Delay_Intrest;
    private String PDate;
    private String date;
    private String amount;
    private String blasce;
    private String paymentstatas;
    private String DuepaymentDate;

    public paymentDTO() {
        
    }

    public paymentDTO(String PID, String RID, String PaID, String fee, String Ptype, String Discount, String Gon_rate, String Gon_tax, String Delay_Intrest, String PDate, String date, String amount, String blasce, String paymentstatas, String DuepaymentDate) {
        this.PID = PID;
        this.RID = RID;
        this.PaID = PaID;
        this.fee = fee;
        this.Ptype = Ptype;
        this.Discount = Discount;
        this.Gon_rate = Gon_rate;
        this.Gon_tax = Gon_tax;
        this.Delay_Intrest = Delay_Intrest;
        this.PDate = PDate;
        this.date = date;
        this.amount = amount;
        this.blasce = blasce;
        this.paymentstatas = paymentstatas;
        this.DuepaymentDate = DuepaymentDate;
    }

    /**
     * @return the PID
     */
    public String getPID() {
        return PID;
    }

    /**
     * @param PID the PID to set
     */
    public void setPID(String PID) {
        this.PID = PID;
    }

    /**
     * @return the RID
     */
    public String getRID() {
        return RID;
    }

    /**
     * @param RID the RID to set
     */
    public void setRID(String RID) {
        this.RID = RID;
    }

    /**
     * @return the PaID
     */
    public String getPaID() {
        return PaID;
    }

    /**
     * @param PaID the PaID to set
     */
    public void setPaID(String PaID) {
        this.PaID = PaID;
    }

    /**
     * @return the fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * @return the Ptype
     */
    public String getPtype() {
        return Ptype;
    }

    /**
     * @param Ptype the Ptype to set
     */
    public void setPtype(String Ptype) {
        this.Ptype = Ptype;
    }

    /**
     * @return the Discount
     */
    public String getDiscount() {
        return Discount;
    }

    /**
     * @param Discount the Discount to set
     */
    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    /**
     * @return the Gon_rate
     */
    public String getGon_rate() {
        return Gon_rate;
    }

    /**
     * @param Gon_rate the Gon_rate to set
     */
    public void setGon_rate(String Gon_rate) {
        this.Gon_rate = Gon_rate;
    }

    /**
     * @return the Gon_tax
     */
    public String getGon_tax() {
        return Gon_tax;
    }

    /**
     * @param Gon_tax the Gon_tax to set
     */
    public void setGon_tax(String Gon_tax) {
        this.Gon_tax = Gon_tax;
    }

    /**
     * @return the Delay_Intrest
     */
    public String getDelay_Intrest() {
        return Delay_Intrest;
    }

    /**
     * @param Delay_Intrest the Delay_Intrest to set
     */
    public void setDelay_Intrest(String Delay_Intrest) {
        this.Delay_Intrest = Delay_Intrest;
    }

    /**
     * @return the PDate
     */
    public String getPDate() {
        return PDate;
    }

    /**
     * @param PDate the PDate to set
     */
    public void setPDate(String PDate) {
        this.PDate = PDate;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the blasce
     */
    public String getBlasce() {
        return blasce;
    }

    /**
     * @param blasce the blasce to set
     */
    public void setBlasce(String blasce) {
        this.blasce = blasce;
    }

    /**
     * @return the paymentstatas
     */
    public String getPaymentstatas() {
        return paymentstatas;
    }

    /**
     * @param paymentstatas the paymentstatas to set
     */
    public void setPaymentstatas(String paymentstatas) {
        this.paymentstatas = paymentstatas;
    }

    /**
     * @return the DuepaymentDate
     */
    public String getDuepaymentDate() {
        return DuepaymentDate;
    }

    /**
     * @param DuepaymentDate the DuepaymentDate to set
     */
    public void setDuepaymentDate(String DuepaymentDate) {
        this.DuepaymentDate = DuepaymentDate;
    }

    @Override
    public String toString() {
        return "peymentDTO{" + "PID=" + PID + ", RID=" + RID + ", PaID=" + PaID + ", fee=" + fee + ", Ptype=" + Ptype + ", Discount=" + Discount + ", Gon_rate=" + Gon_rate + ", Gon_tax=" + Gon_tax + ", Delay_Intrest=" + Delay_Intrest + ", PDate=" + PDate + ", date=" + date + ", amount=" + amount + ", blasce=" + blasce + ", paymentstatas=" + paymentstatas + ", DuepaymentDate=" + DuepaymentDate + '}';
    }
    
    }


   