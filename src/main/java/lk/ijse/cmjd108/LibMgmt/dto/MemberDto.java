package lk.ijse.cmjd108.LibMgmt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberDto implements Serializable {
    private String memberId;
    private String name;
    private String email;
    private String membershipDate;
}
