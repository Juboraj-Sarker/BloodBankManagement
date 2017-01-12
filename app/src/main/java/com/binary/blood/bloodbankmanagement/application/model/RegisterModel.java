package com.binary.blood.bloodbankmanagement.application.model;

/**
 * Created by Shaheb Ali on 1/13/2017.
 * Registration Model
 */

public class RegisterModel {
    private String memberId;
    private String memberName;
    private String memberEmail;
    private String memberPhone;
    private String memberPass;
    private String memberLocation;
    private String bloodGroup;

    public RegisterModel(String memberId, String memberName, String memberEmail, String memberPhone, String memberPass, String memberLocation, String bloodGroup) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
        this.memberPass = memberPass;
        this.memberLocation = memberLocation;
        this.bloodGroup = bloodGroup;
    }

    public RegisterModel(String memberName, String memberEmail, String memberPhone, String memberPass, String memberLocation, String bloodGroup) {
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
        this.memberPass = memberPass;
        this.memberLocation = memberLocation;
        this.bloodGroup = bloodGroup;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public String getMemberPass() {
        return memberPass;
    }

    public String getMemberLocation() {
        return memberLocation;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    @Override
    public String toString() {
        return "RegisterModel{" +
                "memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPhone='" + memberPhone + '\'' +
                ", memberPass='" + memberPass + '\'' +
                ", memberLocation='" + memberLocation + '\'' +
                '}';
    }


}
