package lk.ijse.cmjd108.LibMgmt.dao;

import lk.ijse.cmjd108.LibMgmt.entities.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDao extends JpaRepository<StaffEntity,String> {
}
