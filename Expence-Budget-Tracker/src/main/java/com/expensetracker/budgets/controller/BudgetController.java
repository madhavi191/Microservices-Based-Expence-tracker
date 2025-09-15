package com.expensetracker.budgets.controller;

import com.expensetracker.budgets.model.Budget;
import com.expensetracker.budgets.service.BudgetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budgets")
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping
    public List<Budget> getAllBudgets() {
        return budgetService.getAllBudgets();
    }

    @GetMapping("/{id}")
    public Budget getBudget(@PathVariable String id) {
        return budgetService.getBudgetById(id);
    }

    @PostMapping
    public Budget createBudget(@RequestBody Budget budget) {
        return budgetService.saveBudget(budget);
    }

    @DeleteMapping("/{id}")
    public void deleteBudget(@PathVariable String id) {
        budgetService.deleteBudget(id);
    }
}
