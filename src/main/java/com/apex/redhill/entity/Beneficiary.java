package com.apex.redhill.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "beneficiary")
public class Beneficiary {
    @Id
    private int id;

    @Column(name = "status")
    private String status;

    @Column(name = "nric")
    private String nric;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "race")
    private String race;

    @Column(name = "block")
    private String block;

    @Column(name = "street_name")
    private String street_name;

    @Column(name = "unit")
    private String unit;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "food_pack")
    private String foodPack;

    @Column(name = "delivery_type")
    private String deliveryType;

    @Column(name = "collection_method")
    private String collectionMethod;

    @Column(name = "public_assistance_number")
    private String publicAssistanceNumber;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "pa_status")
    private String paStatus;

    @Column(name = "other_assistance")
    private String otherAssistance;

    @Column(name = "approved_by")
    private String approvedBy;

    @Column(name = "date_of_approval")
    private String dateOfApproval;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "special_request")
    private String specialRequest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNric() {
        return nric;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String firstName) {
        this.fullName = firstName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFoodPack() {
        return foodPack;
    }

    public void setFoodPack(String foodPack) {
        this.foodPack = foodPack;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getCollectionMethod() {
        return collectionMethod;
    }

    public void setCollectionMethod(String collectionMethod) {
        this.collectionMethod = collectionMethod;
    }

    public String getPublicAssistanceNumber() {
        return publicAssistanceNumber;
    }

    public void setPublicAssistanceNumber(String publicAssistanceNumber) {
        this.publicAssistanceNumber = publicAssistanceNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPaStatus() {
        return paStatus;
    }

    public void setPaStatus(String paStatus) {
        this.paStatus = paStatus;
    }

    public String getOtherAssistance() {
        return otherAssistance;
    }

    public void setOtherAssistance(String otherAssistance) {
        this.otherAssistance = otherAssistance;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getDateOfApproval() {
        return dateOfApproval;
    }

    public void setDateOfApproval(String dateOfApproval) {
        this.dateOfApproval = dateOfApproval;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

}
