package com.itheima.domain.cargo;

import java.util.Date;

public class Packing {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.PACKING_LIST_ID
     *
     * @mbg.generated
     */
    private String packingListId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.SELLER
     *
     * @mbg.generated
     */
    private String seller;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.BUYER
     *
     * @mbg.generated
     */
    private String buyer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.INVOICE_NO
     *
     * @mbg.generated
     */
    private String invoiceNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.INVOICE_DATE
     *
     * @mbg.generated
     */
    private Date invoiceDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.MARKS
     *
     * @mbg.generated
     */
    private String marks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.DESCRIPTIONS
     *
     * @mbg.generated
     */
    private String descriptions;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.EXPORT_IDS
     *
     * @mbg.generated
     */
    private String exportIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.EXPORT_NOS
     *
     * @mbg.generated
     */
    private String exportNos;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.STATE
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.CREATE_BY
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.CREATE_DEPT
     *
     * @mbg.generated
     */
    private String createDept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column packing_list_c.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.PACKING_LIST_ID
     *
     * @return the value of packing_list_c.PACKING_LIST_ID
     *
     * @mbg.generated
     */
    public String getPackingListId() {
        return packingListId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.PACKING_LIST_ID
     *
     * @param packingListId the value for packing_list_c.PACKING_LIST_ID
     *
     * @mbg.generated
     */
    public void setPackingListId(String packingListId) {
        this.packingListId = packingListId == null ? null : packingListId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.SELLER
     *
     * @return the value of packing_list_c.SELLER
     *
     * @mbg.generated
     */
    public String getSeller() {
        return seller;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.SELLER
     *
     * @param seller the value for packing_list_c.SELLER
     *
     * @mbg.generated
     */
    public void setSeller(String seller) {
        this.seller = seller == null ? null : seller.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.BUYER
     *
     * @return the value of packing_list_c.BUYER
     *
     * @mbg.generated
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.BUYER
     *
     * @param buyer the value for packing_list_c.BUYER
     *
     * @mbg.generated
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.INVOICE_NO
     *
     * @return the value of packing_list_c.INVOICE_NO
     *
     * @mbg.generated
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.INVOICE_NO
     *
     * @param invoiceNo the value for packing_list_c.INVOICE_NO
     *
     * @mbg.generated
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.INVOICE_DATE
     *
     * @return the value of packing_list_c.INVOICE_DATE
     *
     * @mbg.generated
     */
    public Date getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.INVOICE_DATE
     *
     * @param invoiceDate the value for packing_list_c.INVOICE_DATE
     *
     * @mbg.generated
     */
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.MARKS
     *
     * @return the value of packing_list_c.MARKS
     *
     * @mbg.generated
     */
    public String getMarks() {
        return marks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.MARKS
     *
     * @param marks the value for packing_list_c.MARKS
     *
     * @mbg.generated
     */
    public void setMarks(String marks) {
        this.marks = marks == null ? null : marks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.DESCRIPTIONS
     *
     * @return the value of packing_list_c.DESCRIPTIONS
     *
     * @mbg.generated
     */
    public String getDescriptions() {
        return descriptions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.DESCRIPTIONS
     *
     * @param descriptions the value for packing_list_c.DESCRIPTIONS
     *
     * @mbg.generated
     */
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions == null ? null : descriptions.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.EXPORT_IDS
     *
     * @return the value of packing_list_c.EXPORT_IDS
     *
     * @mbg.generated
     */
    public String getExportIds() {
        return exportIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.EXPORT_IDS
     *
     * @param exportIds the value for packing_list_c.EXPORT_IDS
     *
     * @mbg.generated
     */
    public void setExportIds(String exportIds) {
        this.exportIds = exportIds == null ? null : exportIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.EXPORT_NOS
     *
     * @return the value of packing_list_c.EXPORT_NOS
     *
     * @mbg.generated
     */
    public String getExportNos() {
        return exportNos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.EXPORT_NOS
     *
     * @param exportNos the value for packing_list_c.EXPORT_NOS
     *
     * @mbg.generated
     */
    public void setExportNos(String exportNos) {
        this.exportNos = exportNos == null ? null : exportNos.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.STATE
     *
     * @return the value of packing_list_c.STATE
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.STATE
     *
     * @param state the value for packing_list_c.STATE
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.CREATE_BY
     *
     * @return the value of packing_list_c.CREATE_BY
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.CREATE_BY
     *
     * @param createBy the value for packing_list_c.CREATE_BY
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.CREATE_DEPT
     *
     * @return the value of packing_list_c.CREATE_DEPT
     *
     * @mbg.generated
     */
    public String getCreateDept() {
        return createDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.CREATE_DEPT
     *
     * @param createDept the value for packing_list_c.CREATE_DEPT
     *
     * @mbg.generated
     */
    public void setCreateDept(String createDept) {
        this.createDept = createDept == null ? null : createDept.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column packing_list_c.CREATE_TIME
     *
     * @return the value of packing_list_c.CREATE_TIME
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column packing_list_c.CREATE_TIME
     *
     * @param createTime the value for packing_list_c.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}