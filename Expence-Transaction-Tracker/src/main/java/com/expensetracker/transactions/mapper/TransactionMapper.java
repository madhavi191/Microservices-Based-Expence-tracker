package com.expensetracker.transactions.mapper;

import com.expensetracker.transactions.DTO.TransactionDTO;
import com.expensetracker.transactions.model.Transaction;
import java.time.LocalDateTime;

public class TransactionMapper {

    public static Transaction toEntity(TransactionDTO dto) {
        Transaction t = new Transaction();
        t.setUserId(dto.getUserId());
        t.setDescription(dto.getDescription() != null ? dto.getDescription() : "Expense Recorded");
        t.setAmount(dto.getAmount());
        t.setType(dto.getType() != null ? dto.getType() : "DEBIT");
        t.setTransactionDate(dto.getTransactionDate() != null ? dto.getTransactionDate() : LocalDateTime.now());
        return t;
    }

    public static TransactionDTO toDTO(Transaction t) {
        return new TransactionDTO(
                t.getUserId(),
                t.getDescription(),
                t.getAmount(),
                t.getType(),
                t.getTransactionDate()
        );
    }
}
