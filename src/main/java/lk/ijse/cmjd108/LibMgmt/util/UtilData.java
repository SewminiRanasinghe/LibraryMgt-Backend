package lk.ijse.cmjd108.LibMgmt.util;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class UtilData {

    //Generate IDs
    public static String generateBookId(){
        return "B-"+ UUID.randomUUID();
    }

    public static String generateMemberId(){
        return "M-"+ UUID.randomUUID();
    }

    public static String generateStaffId(){
        return "S-"+ UUID.randomUUID();
    }

    public static String generateLendingId(){
        return "L-"+ UUID.randomUUID();
    }

    //generate last update date and time
    public static LocalDate generateTodayDate(){
        return LocalDate.now();
    }
    public static Time generateCurrentTime(){
        return Time.valueOf(LocalTime.now());
    }
}
