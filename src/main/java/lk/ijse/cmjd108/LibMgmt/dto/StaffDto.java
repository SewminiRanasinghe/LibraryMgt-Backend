package lk.ijse.cmjd108.LibMgmt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StaffDto implements Serializable {

    private String staffId;
    private String firstName;
    private String lastName;
    private String email;
    private String joinDate;
    private String phone;
    private Role role;
}
