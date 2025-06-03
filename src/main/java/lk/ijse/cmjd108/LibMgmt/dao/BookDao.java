package lk.ijse.cmjd108.LibMgmt.dao;

import lk.ijse.cmjd108.LibMgmt.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<BookEntity,String> {
}
