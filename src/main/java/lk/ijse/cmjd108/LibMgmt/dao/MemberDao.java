package lk.ijse.cmjd108.LibMgmt.dao;

import lk.ijse.cmjd108.LibMgmt.entities.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao extends JpaRepository<MemberEntity,String> {
}
