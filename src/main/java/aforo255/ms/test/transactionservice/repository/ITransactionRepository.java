package aforo255.ms.test.transactionservice.repository;

import aforo255.ms.test.transactionservice.entity.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransactionRepository extends MongoRepository<Transaction, String> {

    @Query("{'id_invoice' : ?0}")
    public Iterable<Transaction> findByInvoiceId(Integer invoiceId);
}
