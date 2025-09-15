package com.expensetracker.transactions.DTO;

import java.time.LocalDateTime;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class TransactionDTO {

    @NotNull(message = "User ID cannot be null")
    private String userId;

    private String description;

    @Positive(message = "Amount must be greater than 0")
    private Double amount;

    private String type;
    private LocalDateTime transactionDate;

    public TransactionDTO() {}

    public TransactionDTO(String userId, String description, Double amount, String type, LocalDateTime transactionDate) {
        this.userId = userId;
        this.description = description;
        this.amount = amount;
        this.type = type;
        this.transactionDate = transactionDate;
    }

    // Getters & Setters
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public LocalDateTime getTransactionDate() { return transactionDate; }
    public void setTransactionDate(LocalDateTime transactionDate) { this.transactionDate = transactionDate; }
}
