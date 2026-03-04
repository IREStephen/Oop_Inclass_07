package ie.atu.oop_inclass_07.service;


import ie.atu.oop_inclass_07.model.Loan;
import org.springframework.stereotype.Service;
import springframework.stereotype.@Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {
    private final List<Loan> loans = new ArrayList<>();
    private nextId = 1;
}

public Loan addLoan(Loan loan) {
    int endHour = loan.getStartHour() loan.getDurationHours()

}