/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 3/10/2018
 * Time: 4:37 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */

package readermind.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Journal {
    private BigDecimal journalId;
    private String createdBy;
    private Timestamp createdDate;
    private Integer status;
    private String updatedBy;
    private Timestamp updatedDate;
    private Double baseCurrencyAmount;
    private Integer baseCurrencyId;
    private Double entryCurrencyAmount;
    private Integer entryCurrencyId;
    private Double exchangeRate;
    private Integer accountId;
    private Double amount;
    private Integer businessId;
    private Timestamp date;
    private Integer drCrIndicator;
    private Integer financialYearId;
    private String journalReferenceNo;
    private String note;
    private Integer partyId;
    private Integer partyType;
    private Integer period;
    private Integer referenceId;
    private Integer referenceType;

    @Id
    @Column(name = "journalID")
    public BigDecimal getJournalId() {
        return journalId;
    }

    public void setJournalId(BigDecimal journalId) {
        this.journalId = journalId;
    }

    @Basic
    @Column(name = "createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "createdDate")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Basic
    @Column(name = "updatedDate")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Basic
    @Column(name = "baseCurrencyAmount")
    public Double getBaseCurrencyAmount() {
        return baseCurrencyAmount;
    }

    public void setBaseCurrencyAmount(Double baseCurrencyAmount) {
        this.baseCurrencyAmount = baseCurrencyAmount;
    }

    @Basic
    @Column(name = "baseCurrencyID")
    public Integer getBaseCurrencyId() {
        return baseCurrencyId;
    }

    public void setBaseCurrencyId(Integer baseCurrencyId) {
        this.baseCurrencyId = baseCurrencyId;
    }

    @Basic
    @Column(name = "entryCurrencyAmount")
    public Double getEntryCurrencyAmount() {
        return entryCurrencyAmount;
    }

    public void setEntryCurrencyAmount(Double entryCurrencyAmount) {
        this.entryCurrencyAmount = entryCurrencyAmount;
    }

    @Basic
    @Column(name = "entryCurrencyID")
    public Integer getEntryCurrencyId() {
        return entryCurrencyId;
    }

    public void setEntryCurrencyId(Integer entryCurrencyId) {
        this.entryCurrencyId = entryCurrencyId;
    }

    @Basic
    @Column(name = "exchangeRate")
    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Basic
    @Column(name = "accountID")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "businessID")
    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "drCrIndicator")
    public Integer getDrCrIndicator() {
        return drCrIndicator;
    }

    public void setDrCrIndicator(Integer drCrIndicator) {
        this.drCrIndicator = drCrIndicator;
    }

    @Basic
    @Column(name = "financialYearID")
    public Integer getFinancialYearId() {
        return financialYearId;
    }

    public void setFinancialYearId(Integer financialYearId) {
        this.financialYearId = financialYearId;
    }

    @Basic
    @Column(name = "journalReferenceNo")
    public String getJournalReferenceNo() {
        return journalReferenceNo;
    }

    public void setJournalReferenceNo(String journalReferenceNo) {
        this.journalReferenceNo = journalReferenceNo;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "partyID")
    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    @Basic
    @Column(name = "partyType")
    public Integer getPartyType() {
        return partyType;
    }

    public void setPartyType(Integer partyType) {
        this.partyType = partyType;
    }

    @Basic
    @Column(name = "period")
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    @Basic
    @Column(name = "referenceID")
    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    @Basic
    @Column(name = "referenceType")
    public Integer getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(Integer referenceType) {
        this.referenceType = referenceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Journal journal = (Journal) o;

        if (journalId != null ? !journalId.equals(journal.journalId) : journal.journalId != null) return false;
        if (createdBy != null ? !createdBy.equals(journal.createdBy) : journal.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(journal.createdDate) : journal.createdDate != null) return false;
        if (status != null ? !status.equals(journal.status) : journal.status != null) return false;
        if (updatedBy != null ? !updatedBy.equals(journal.updatedBy) : journal.updatedBy != null) return false;
        if (updatedDate != null ? !updatedDate.equals(journal.updatedDate) : journal.updatedDate != null) return false;
        if (baseCurrencyAmount != null ? !baseCurrencyAmount.equals(journal.baseCurrencyAmount) : journal.baseCurrencyAmount != null)
            return false;
        if (baseCurrencyId != null ? !baseCurrencyId.equals(journal.baseCurrencyId) : journal.baseCurrencyId != null)
            return false;
        if (entryCurrencyAmount != null ? !entryCurrencyAmount.equals(journal.entryCurrencyAmount) : journal.entryCurrencyAmount != null)
            return false;
        if (entryCurrencyId != null ? !entryCurrencyId.equals(journal.entryCurrencyId) : journal.entryCurrencyId != null)
            return false;
        if (exchangeRate != null ? !exchangeRate.equals(journal.exchangeRate) : journal.exchangeRate != null)
            return false;
        if (accountId != null ? !accountId.equals(journal.accountId) : journal.accountId != null) return false;
        if (amount != null ? !amount.equals(journal.amount) : journal.amount != null) return false;
        if (businessId != null ? !businessId.equals(journal.businessId) : journal.businessId != null) return false;
        if (date != null ? !date.equals(journal.date) : journal.date != null) return false;
        if (drCrIndicator != null ? !drCrIndicator.equals(journal.drCrIndicator) : journal.drCrIndicator != null)
            return false;
        if (financialYearId != null ? !financialYearId.equals(journal.financialYearId) : journal.financialYearId != null)
            return false;
        if (journalReferenceNo != null ? !journalReferenceNo.equals(journal.journalReferenceNo) : journal.journalReferenceNo != null)
            return false;
        if (note != null ? !note.equals(journal.note) : journal.note != null) return false;
        if (partyId != null ? !partyId.equals(journal.partyId) : journal.partyId != null) return false;
        if (partyType != null ? !partyType.equals(journal.partyType) : journal.partyType != null) return false;
        if (period != null ? !period.equals(journal.period) : journal.period != null) return false;
        if (referenceId != null ? !referenceId.equals(journal.referenceId) : journal.referenceId != null) return false;
        if (referenceType != null ? !referenceType.equals(journal.referenceType) : journal.referenceType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = journalId != null ? journalId.hashCode() : 0;
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        result = 31 * result + (baseCurrencyAmount != null ? baseCurrencyAmount.hashCode() : 0);
        result = 31 * result + (baseCurrencyId != null ? baseCurrencyId.hashCode() : 0);
        result = 31 * result + (entryCurrencyAmount != null ? entryCurrencyAmount.hashCode() : 0);
        result = 31 * result + (entryCurrencyId != null ? entryCurrencyId.hashCode() : 0);
        result = 31 * result + (exchangeRate != null ? exchangeRate.hashCode() : 0);
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (businessId != null ? businessId.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (drCrIndicator != null ? drCrIndicator.hashCode() : 0);
        result = 31 * result + (financialYearId != null ? financialYearId.hashCode() : 0);
        result = 31 * result + (journalReferenceNo != null ? journalReferenceNo.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (partyId != null ? partyId.hashCode() : 0);
        result = 31 * result + (partyType != null ? partyType.hashCode() : 0);
        result = 31 * result + (period != null ? period.hashCode() : 0);
        result = 31 * result + (referenceId != null ? referenceId.hashCode() : 0);
        result = 31 * result + (referenceType != null ? referenceType.hashCode() : 0);
        return result;
    }
}
