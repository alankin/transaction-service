package aforo255.ms.test.transactionservice.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "operation")
public class Operation {

    private Integer idOperation;

    private Integer idInvoice;

    private double amount;

    private String creationDate;


    public Integer getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(Integer idOperation) {
        this.idOperation = idOperation;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
