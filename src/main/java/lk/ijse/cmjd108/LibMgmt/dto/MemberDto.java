package lk.ijse.cmjd108.LibMgmt.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class MemberDto implements Serializable {
    private String memberId;
    private String name;
    private String email;
    private LocalDate membershipDate;

    public MemberDto(String email, String memberId, LocalDate membershipDate, String name) {
        this.email = email;
        this.memberId = memberId;
        this.membershipDate = membershipDate;
        this.name = name;
    }

    public MemberDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public LocalDate getMembershipDate() {
        return membershipDate;
    }

    public void setMembershipDate(LocalDate membershipDate) {
        this.membershipDate = membershipDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "email='" + email + '\'' +
                ", memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", membershipDate='" + membershipDate + '\'' +
                '}';
    }
}
