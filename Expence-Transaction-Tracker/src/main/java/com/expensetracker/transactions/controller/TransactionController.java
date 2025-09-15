package com.expensetracker.transactions.controller;

import com.expensetracker.transactions.DTO.TransactionDTO;
import com.expensetracker.transactions.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TransactionDTO> create(@Valid @RequestBody TransactionDTO dto) {
        return ResponseEntity.ok(service.createTransaction(dto));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<TransactionDTO>> getByUser(@PathVariable String userId) {
        return ResponseEntity.ok(service.getTransactionsByUser(userId));
    }
}

