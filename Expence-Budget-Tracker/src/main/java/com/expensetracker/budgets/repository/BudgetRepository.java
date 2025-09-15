package com.expensetracker.budgets.repository;

import com.expensetracker.budgets.model.Budget;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends MongoRepository<Budget, String> {
}
