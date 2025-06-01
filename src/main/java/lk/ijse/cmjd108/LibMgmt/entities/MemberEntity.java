package lk.ijse.cmjd108.LibMgmt.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;
@Table(name = "member")
public class MemberEntity {
    private String memberId;
    private String name;
    private String email;
    private LocalDate membershipDate;
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LendingEntity> lendings;

    public MemberEntity() {
    }

    public MemberEntity(String email, List<LendingEntity> lendings, String memberId, LocalDate membershipDate, String name) {
        this.email = email;
        this.lendings = lendings;
        this.memberId = memberId;
        this.membershipDate = membershipDate;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<LendingEntity> getLendings() {
        return lendings;
    }

    public void setLendings(List<LendingEntity> lendings) {
        this.lendings = lendings;
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
        return "MemberEntity{" +
                "email='" + email + '\'' +
                ", memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", membershipDate=" + membershipDate +
                ", lendings=" + lendings +
                '}';
    }
}