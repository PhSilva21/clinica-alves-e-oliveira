package com.bandeira.clinica_alves_oliveira.dtos;

import com.bandeira.clinica_alves_oliveira.model.ExpenseType;
import com.bandeira.clinica_alves_oliveira.model.Origin;

public record UpdateExpenseDTO(

        ExpenseType expenseType,

        String name,

        Origin origin
) {
}
