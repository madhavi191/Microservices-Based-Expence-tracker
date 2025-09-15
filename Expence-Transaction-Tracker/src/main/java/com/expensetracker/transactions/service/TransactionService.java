package com.expensetracker.transactions.service;

import com.expensetracker.transactions.DTO.TransactionDTO;
import com.expensetracker.transactions.mapper.TransactionMapper;
import com.expensetracker.transactions.model.Transaction;
import com.expensetracker.transactions.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public TransactionDTO createTransaction(TransactionDTO dto) {
        Transaction t = TransactionMapper.toEntity(dto);
        Transaction saved = repository.save(t);
        return TransactionMapper.toDTO(saved);
    }

    public List<TransactionDTO> getTransactionsByUser(String userId) {
        return repository.findByUserId(userId)
                .stream()
                .map(TransactionMapper::toDTO)
                .collect(Collectors.toList());
    }
}
