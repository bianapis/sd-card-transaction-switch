package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardTransactionSwitchResponse
 */
public class CardTransactionSwitchResponse   {
  private String cardTransactionSwitchOperatingSessionReference = null;

  private String cardTransactionSwitchReference = null;

  private String cardTransactionSwitchOperatingSchedule = null;

  private String cardTransactionSwitchConfiguration = null;

  private String cardTransactionSwitchStatus = null;

  private String networkReference = null;

  private String participantAcquirerBankReference = null;

  private String participantAcquirerBanktransactionRoutingDetails = null;

  private String participantIssuerBankReference = null;

  private String participantIssuerBankTransactionRoutingDetails = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the active Card Transaction Switch operating session\"    
   * @return cardTransactionSwitchOperatingSessionReference
  **/

  public String getCardTransactionSwitchOperatingSessionReference() {
    return cardTransactionSwitchOperatingSessionReference;
  }

  public void setCardTransactionSwitchOperatingSessionReference(String cardTransactionSwitchOperatingSessionReference) {
    this.cardTransactionSwitchOperatingSessionReference = cardTransactionSwitchOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the card transaction switch operational capability\" 
   * @return cardTransactionSwitchReference
  **/

  public String getCardTransactionSwitchReference() {
    return cardTransactionSwitchReference;
  }

  public void setCardTransactionSwitchReference(String cardTransactionSwitchReference) {
    this.cardTransactionSwitchReference = cardTransactionSwitchReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"defines service availability\" 
   * @return cardTransactionSwitchOperatingSchedule
  **/

  public String getCardTransactionSwitchOperatingSchedule() {
    return cardTransactionSwitchOperatingSchedule;
  }

  public void setCardTransactionSwitchOperatingSchedule(String cardTransactionSwitchOperatingSchedule) {
    this.cardTransactionSwitchOperatingSchedule = cardTransactionSwitchOperatingSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"defines service configuration settings\" 
   * @return cardTransactionSwitchConfiguration
  **/

  public String getCardTransactionSwitchConfiguration() {
    return cardTransactionSwitchConfiguration;
  }

  public void setCardTransactionSwitchConfiguration(String cardTransactionSwitchConfiguration) {
    this.cardTransactionSwitchConfiguration = cardTransactionSwitchConfiguration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"defines operational status of the switch - used to determine when store and forward processing applies\" 
   * @return cardTransactionSwitchStatus
  **/

  public String getCardTransactionSwitchStatus() {
    return cardTransactionSwitchStatus;
  }

  public void setCardTransactionSwitchStatus(String cardTransactionSwitchStatus) {
    this.cardTransactionSwitchStatus = cardTransactionSwitchStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the card Network\" 
   * @return networkReference
  **/

  public String getNetworkReference() {
    return networkReference;
  }

  public void setNetworkReference(String networkReference) {
    this.networkReference = networkReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the Acquiring bank for which the Network orchestrates transaction routing\" 
   * @return participantAcquirerBankReference
  **/

  public String getParticipantAcquirerBankReference() {
    return participantAcquirerBankReference;
  }

  public void setParticipantAcquirerBankReference(String participantAcquirerBankReference) {
    this.participantAcquirerBankReference = participantAcquirerBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"defines transaction routing details - referenced by Network\" 
   * @return participantAcquirerBanktransactionRoutingDetails
  **/

  public String getParticipantAcquirerBanktransactionRoutingDetails() {
    return participantAcquirerBanktransactionRoutingDetails;
  }

  public void setParticipantAcquirerBanktransactionRoutingDetails(String participantAcquirerBanktransactionRoutingDetails) {
    this.participantAcquirerBanktransactionRoutingDetails = participantAcquirerBanktransactionRoutingDetails;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the Issuing bank for which the Network orchestrates transaction routing\" 
   * @return participantIssuerBankReference
  **/

  public String getParticipantIssuerBankReference() {
    return participantIssuerBankReference;
  }

  public void setParticipantIssuerBankReference(String participantIssuerBankReference) {
    this.participantIssuerBankReference = participantIssuerBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"defines transaction routing details - referenced by Network\" 
   * @return participantIssuerBankTransactionRoutingDetails
  **/

  public String getParticipantIssuerBankTransactionRoutingDetails() {
    return participantIssuerBankTransactionRoutingDetails;
  }

  public void setParticipantIssuerBankTransactionRoutingDetails(String participantIssuerBankTransactionRoutingDetails) {
    this.participantIssuerBankTransactionRoutingDetails = participantIssuerBankTransactionRoutingDetails;
  }


}

