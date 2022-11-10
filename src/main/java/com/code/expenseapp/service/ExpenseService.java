package com.code.expenseapp.service;

import com.code.expenseapp.entity.Expense;

import java.util.List;

public interface ExpenseService {

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);
}
