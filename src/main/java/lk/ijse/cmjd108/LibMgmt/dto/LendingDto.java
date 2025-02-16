package lk.ijse.cmjd108.LibMgmt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LendingDto implements Serializable {
    private String lendingId;
    private String book;
    private String member;
    private String returnDate;
    private Boolean isActiveLending;
    private Long overDueDays;
    private Double fineAmount;
}
