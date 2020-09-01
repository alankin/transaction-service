package aforo255.ms.test.transactionservice.service;

import aforo255.ms.test.transactionservice.entity.Transaction;
import aforo255.ms.test.transactionservice.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements ITransactionService {

    @Autowired
    private ITransactionRepository repository;

    @Override
    public Transaction save(Transaction transaction) {
        return repository.save(transaction);
    }

    @Override
    public Iterable<Transaction> findByInvoiceId(Integer invoiceId) {
        return repository.findByInvoiceId(invoiceId);
    }

    @Override
    public Iterable<Transaction> findAll() {
        return repository.findAll();
    }
}
