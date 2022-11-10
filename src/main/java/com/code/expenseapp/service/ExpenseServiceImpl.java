package com.code.expenseapp.service;

import com.code.expenseapp.entity.Expense;
import com.code.expenseapp.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    private ExpenseRepository expenseRepo;

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepo.findAll();
    }
}
