package Model;
// Generated 15-Mar-2016 09:12:53 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * TblAccount generated by hbm2java
 */
public class TblAccount  implements java.io.Serializable {


     private BigDecimal accountId;
     private BigDecimal accountBalance;
     private String accountBeneficiary;
     private String accountType;

    public TblAccount() {
    }

	
    public TblAccount(BigDecimal accountId) {
        this.accountId = accountId;
    }
    public TblAccount(BigDecimal accountId, BigDecimal accountBalance, String accountBeneficiary, String accountType) {
       this.accountId = accountId;
       this.accountBalance = accountBalance;
       this.accountBeneficiary = accountBeneficiary;
       this.accountType = accountType;
    }
   
    public BigDecimal getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(BigDecimal accountId) {
        this.accountId = accountId;
    }
    public BigDecimal getAccountBalance() {
        return this.accountBalance;
    }
    
    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getAccountBeneficiary() {
        return this.accountBeneficiary;
    }
    
    public void setAccountBeneficiary(String accountBeneficiary) {
        this.accountBeneficiary = accountBeneficiary;
    }
    public String getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }




}


