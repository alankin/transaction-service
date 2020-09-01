package aforo255.ms.test.transactionservice.service;


import aforo255.ms.test.transactionservice.entity.Transaction;

public interface ITransactionService {

    public Transaction save(Transaction transaction);

    public Iterable<Transaction> findByInvoiceId(Integer invoiceId);

    public Iterable<Transaction> findAll();
}