package lk.ijse.cmjd108.LibMgmt.dao;

import lk.ijse.cmjd108.LibMgmt.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<BookEntity,String> {
    //JPQL
    @Query("SELECT SUM(b.availableQty) FROM BookEntity b WHERE b.bookId = :bookId")
    int availableQty(@Param("bookId") String bookId);

    @Query("UPDATE BookEntity b SET b.avilableQty = b.avilableQty - 1 WHERE b.bookId = :bookId AND b.avilableQty > 0")
    int deductBasedOnLending(@Param("bookId") String bookId);
}
