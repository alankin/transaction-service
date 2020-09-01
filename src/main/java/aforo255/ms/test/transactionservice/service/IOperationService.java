package aforo255.ms.test.transactionservice.service;


import aforo255.ms.test.transactionservice.entity.Operation;

public interface IOperationService {

    public Operation save(Operation Operation);

    public Iterable<Operation> findAll();

    public Operation findById(Integer operationId);
}