package aforo255.ms.test.transactionservice.dao;

import aforo255.ms.test.transactionservice.entity.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDao extends MongoRepository<Transaction, Integer> {

}
