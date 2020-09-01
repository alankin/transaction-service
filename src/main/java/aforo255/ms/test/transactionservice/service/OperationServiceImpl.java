package aforo255.ms.test.transactionservice.service;

import aforo255.ms.test.transactionservice.dao.OperationDao;
import aforo255.ms.test.transactionservice.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements IOperationService {

    @Autowired
    private OperationDao repository;

    @Override
    public Operation save(Operation operation) {
        return repository.save(operation);
    }

    @Override
    public Iterable<Operation> findAll() {
        return repository.findAll();
    }

    @Override
    public Operation findById(Integer operationId) {
        return repository.findById(operationId).orElse(null);
    }
}
