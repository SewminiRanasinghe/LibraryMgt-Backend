package lk.ijse.cmjd108.LibMgmt.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class StaffDto implements Serializable {

    private String staffId;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate joinDate;
    private String phone;
    private Role role;

    public StaffDto(String email, String firstName, LocalDate joinDate, String lastName, String phone, Role role, String staffId) {
        this.email = email;
        this.firstName = firstName;
        this.joinDate = joinDate;
        this.lastName = lastName;
        this.phone = phone;
        this.role = role;
        this.staffId = staffId;
    }

    public StaffDto() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "StaffDto{" +
                "email='" + email + '\'' +
                ", staffId='" + staffId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", phone='" + phone + '\'' +
                ", role=" + role +
                '}';
    }
}
