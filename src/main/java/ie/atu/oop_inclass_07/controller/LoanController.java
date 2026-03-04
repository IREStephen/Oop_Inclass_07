package ie.atu.oop_inclass_07.controller;

import ie.atu.oop_inclass_07.model.Loan;
import ie.atu.oop_inclass_07.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {
    private LoanService loanService;
}

public LoanController(LoanService loanService) {
    this.LoanService = loanService;
}

@PostMapping
public ResponseEntity<Loan>addLoan(@Valid@RequestBody Loan loan) {
    Loan saved = LoanService.addLoan(loan);
    return ResponseEntity.ok().body(saved);
}

@GetMapping
public ResponseEntity<List<Loan>>getAllLoan() {
    return ResponseEntity.ok(LoanService.getAllLoan());
}