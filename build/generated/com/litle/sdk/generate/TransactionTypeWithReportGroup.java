//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionTypeWithReportGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionTypeWithReportGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.litle.com/schema}transactionType">
 *       &lt;attribute name="reportGroup" use="required" type="{http://www.litle.com/schema}reportGroupType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionTypeWithReportGroup")
@XmlSeeAlso({
    EcheckCreditResponse.class,
    PhysicalCheckCreditResponse.class,
    QueryTransactionUnavailableResponse.class,
    Activate.class,
    EcheckVoid.class,
    GiftCardCredit.class,
    FraudCheck.class,
    AuthReversal.class,
    ServiceStatusResponse.class,
    ReserveCreditResponse.class,
    AuthReversalResponse.class,
    PhysicalCheckCredit.class,
    SubmerchantCreditResponse.class,
    EcheckVerificationResponse.class,
    QueryTransactionResponse.class,
    LoadReversalResponse.class,
    Load.class,
    EcheckPreNoteCreditResponse.class,
    AccountUpdate.class,
    AccountUpdateResponse.class,
    UnloadResponse.class,
    EcheckPreNoteSaleResponse.class,
    CreditResponse.class,
    AuthorizationResponse.class,
    BalanceInquiryResponse.class,
    EcheckRedeposit.class,
    VendorCreditResponse.class,
    RegisterTokenResponse.class,
    DeactivateResponse.class,
    SubmerchantCredit.class,
    DeactivateReversalResponse.class,
    Void.class,
    GiftCardCaptureResponse.class,
    UnloadReversal.class,
    RegisterTokenRequestType.class,
    GiftCardAuthReversalResponse.class,
    ActivateResponse.class,
    EcheckSalesResponse.class,
    ForceCapture.class,
    SubmerchantDebitResponse.class,
    Unload.class,
    PayFacCreditResponse.class,
    FraudCheckResponse.class,
    PayFacCredit.class,
    Authorization.class,
    VendorDebit.class,
    PayFacDebitResponse.class,
    GiftCardAuthReversal.class,
    ReserveDebitResponse.class,
    PayFacDebit.class,
    RefundReversalResponse.class,
    Deactivate.class,
    Credit.class,
    VendorCredit.class,
    EcheckCredit.class,
    DeactivateReversal.class,
    VendorDebitResponse.class,
    Sale.class,
    SubmerchantDebit.class,
    SaleResponse.class,
    CaptureGivenAuthResponse.class,
    UpdateCardValidationNumOnTokenResponse.class,
    //FastFundingResponse.class,
    UpdateCardValidationNumOnToken.class,
    ActivateReversal.class,
    EcheckPreNoteSale.class,
    EcheckVoidResponse.class,
    CaptureGivenAuth.class,
    UnloadReversalResponse.class,
    RefundReversal.class,
    ActivateReversalResponse.class,
    DepositReversal.class,
    EcheckSale.class,
    PhysicalCheckDebitResponse.class,
    EcheckPreNoteCredit.class,
    ForceCaptureResponse.class,
    ServiceStatusRequest.class,
    CaptureResponse.class,
    EcheckRedepositResponse.class,
    EcheckVerification.class,
    FundingInstructionVoidResponse.class,
    PhysicalCheckDebit.class,
    LoadResponse.class,
    ReserveCredit.class,
    LoadReversal.class,
    //FastFunding.class,
    GiftCardCreditResponse.class,
    FundingInstructionVoid.class,
    QueryTransaction.class,
    VoidResponse.class,
    ReserveDebit.class,
    BalanceInquiry.class,
    DepositReversalResponse.class
})
public class TransactionTypeWithReportGroup
    extends TransactionType
{

    @XmlAttribute(name = "reportGroup", required = true)
    protected String reportGroup;

    /**
     * Gets the value of the reportGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportGroup() {
        return reportGroup;
    }

    /**
     * Sets the value of the reportGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportGroup(String value) {
        this.reportGroup = value;
    }

}