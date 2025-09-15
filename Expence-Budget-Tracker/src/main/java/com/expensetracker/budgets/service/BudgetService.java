package com.expensetracker.budgets.service;

import com.expensetracker.budgets.model.Budget;
import com.expensetracker.budgets.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    private final BudgetRepository budgetRepository;

    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Budget saveBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public Budget getBudgetById(String id) {
        return budgetRepository.findById(id).orElse(null);
    }

    public void deleteBudget(String id) {
        budgetRepository.deleteById(id);
    }
}
