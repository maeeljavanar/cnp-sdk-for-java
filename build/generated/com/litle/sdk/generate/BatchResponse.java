//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.litle.com/schema}transactionResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.litle.com/schema}recurringTransactionResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.litle.com/schema}string25Type" />
 *       &lt;attribute name="litleBatchId" use="required" type="{http://www.litle.com/schema}litleIdType" />
 *       &lt;attribute name="merchantId" use="required" type="{http://www.litle.com/schema}merchantIdentificationType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recurringTransactionResponses",
    "transactionResponses"
})
@XmlRootElement(name = "batchResponse")
public class BatchResponse {

    @XmlElementRef(name = "recurringTransactionResponse", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends RecurringTransactionResponseType>> recurringTransactionResponses;
    @XmlElementRef(name = "transactionResponse", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TransactionTypeWithReportGroup>> transactionResponses;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "litleBatchId", required = true)
    protected long litleBatchId;
    @XmlAttribute(name = "merchantId", required = true)
    protected String merchantId;

    /**
     * Gets the value of the recurringTransactionResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringTransactionResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringTransactionResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CreatePlanResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link UpdateSubscriptionResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link UpdatePlanResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link RecurringTransactionResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link CancelSubscriptionResponse }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends RecurringTransactionResponseType>> getRecurringTransactionResponses() {
        if (recurringTransactionResponses == null) {
            recurringTransactionResponses = new ArrayList<JAXBElement<? extends RecurringTransactionResponseType>>();
        }
        return this.recurringTransactionResponses;
    }

    /**
     * Gets the value of the transactionResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ActivateResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link UpdateCardValidationNumOnTokenResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link GiftCardCreditResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link CaptureResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link CaptureGivenAuthResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link BalanceInquiryResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link TransactionTypeWithReportGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link EcheckRedepositResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link FastFundingResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link EcheckCreditResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link RefundReversalResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link SubmerchantCreditResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link UnloadReversalResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link EcheckVerificationResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link EcheckVoidResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link PayFacCreditResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link ReserveDebitResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceStatusResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link EcheckPreNoteSaleResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link EcheckSalesResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link RegisterTokenResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link UnloadResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link FundingInstructionVoidResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link VendorCreditResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link VoidResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link QueryTransactionUnavailableResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link PhysicalCheckCreditResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorizationResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link VendorDebitResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link DeactivateReversalResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivateReversalResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountUpdateResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link DepositReversalResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link PhysicalCheckDebitResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link GiftCardCaptureResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link ForceCaptureResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link PayFacDebitResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link GiftCardAuthReversalResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link EcheckPreNoteCreditResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link SubmerchantDebitResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link SaleResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link ReserveCreditResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link QueryTransactionResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link DeactivateResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthReversalResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link FraudCheckResponse }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadReversalResponse }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TransactionTypeWithReportGroup>> getTransactionResponses() {
        if (transactionResponses == null) {
            transactionResponses = new ArrayList<JAXBElement<? extends TransactionTypeWithReportGroup>>();
        }
        return this.transactionResponses;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the litleBatchId property.
     * 
     */
    public long getLitleBatchId() {
        return litleBatchId;
    }

    /**
     * Sets the value of the litleBatchId property.
     * 
     */
    public void setLitleBatchId(long value) {
        this.litleBatchId = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

}