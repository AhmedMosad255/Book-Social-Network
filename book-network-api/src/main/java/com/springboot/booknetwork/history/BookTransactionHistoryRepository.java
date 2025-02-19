package com.springboot.booknetwork.history;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BookTransactionHistoryRepository extends JpaRepository<BookTransactionalHistory, Integer> {

    @Query("""
            SELECT history
            FROM BookTransactionalHistory history
            WHERE history.user.id = :userId
            """)
    Page<BookTransactionalHistory> findAllBorrowedBooks(Pageable pageable, Integer userId);

    @Query("""
            SELECT history
            FROM BookTransactionalHistory history
            WHERE history.book.owner.id = :userId
            """)
    Page<BookTransactionalHistory> findAllReturnedBooks(Pageable pageable, Integer userId);

    @Query("""
            SELECT
            (COUNT(*) > 0) AS isBorrowed
            FROM BookTransactionalHistory bookTransactionalHistory
            WHERE bookTransactionalHistory.user.id = :userId
            AND bookTransactionalHistory.book.id = :bookId
            AND bookTransactionalHistory.returnedApproved = false
            """)
    boolean isAlreadyBorrowedByUser(Integer bookId, Integer userId);

    @Query("""
            SELECT transaction
            FROM BookTransactionalHistory transaction
            WHERE transaction.user.id = :userId
            AND transaction.book.id = :bookId
            AND transaction.returned = false
            AND transaction.returnedApproved = false
            """)
    Optional<BookTransactionalHistory> findByBookIdAndUserId(Integer bookId, Integer userId);

    @Query("""
            SELECT transaction
            FROM BookTransactionalHistory transaction
            WHERE transaction.book.owner.id = :userId
            AND transaction.book.id = :bookId
            AND transaction.returned = true
            AND transaction.returnedApproved = false
            """)
    Optional<BookTransactionalHistory> findByBookIdAndOwnerId(Integer bookId, Integer userId);
}
