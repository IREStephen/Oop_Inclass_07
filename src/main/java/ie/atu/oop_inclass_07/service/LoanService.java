package ie.atu.oop_inclass_07.service;


import ie.atu.oop_inclass_07.model.Loan;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class loanService {
    private final List<Loan> loans = new ArrayList<>();
    private nextId = 1;
}

public addLoan(Loan loan) {
    int endHour = loan.getStartHour() loan.getDurationHours()
if (endHour == 24) {
    throw new IllegalAccessException("cannot extent") }

    int nextId;
    loan.setId(nextId++);
loan.add(loan);
return loan;
}
public List<loan>getAllLoans() {
    return loan;
}
