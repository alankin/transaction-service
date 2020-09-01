package aforo255.ms.test.transactionservice.controller;

import aforo255.ms.test.transactionservice.entity.Transaction;
import aforo255.ms.test.transactionservice.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    private ITransactionService transactionService;

    @GetMapping("/transactions/{invoiceId}")
    public ResponseEntity<?> getByInvoiceId(@PathVariable Integer invoiceId) {
        Iterable<Transaction> iTransaction = transactionService.findByInvoiceId(invoiceId);

        return ResponseEntity.ok(iTransaction);
    }

    @GetMapping("/transactions")
    public List<Transaction> listTransactions() {
        return (List<Transaction>) transactionService.findAll();
    }
}

