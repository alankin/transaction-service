package aforo255.ms.test.transactionservice.service;

import aforo255.ms.test.transactionservice.entity.Operation;
import aforo255.ms.test.transactionservice.entity.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionEvents {

    private Logger logger = LoggerFactory.getLogger(TransactionEvents.class);

    @Autowired
    private ITransactionService transactionService;

    @Autowired
    private IOperationService operationService;

    @Autowired
    private ObjectMapper objectMapper;

    public void process(ConsumerRecord<Integer, String> consumerRecord) throws JsonProcessingException {
        Operation operation = objectMapper.readValue(consumerRecord.value(), Operation.class);

        operationService.save(operation);

        Transaction transaction = new Transaction();
        transaction.setAmount(operation.getAmount());
        transaction.setCreationDate(operation.getCreationDate());
        transaction.setId_invoice(operation.getIdInvoice());

        logger.info("Saving transaction with invoiceId: {} and amount: {}", transaction.getId_invoice(), transaction.getAmount());
        transactionService.save(transaction);

    }
}
