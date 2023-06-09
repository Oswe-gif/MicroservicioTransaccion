package com.example.Transaccional.endpoint;

import com.example.Transaccional.endpoint.dto.AccountResponseDTO;
import com.example.Transaccional.endpoint.dto.DepositMoneyUserDto;
import com.example.Transaccional.endpoint.dto.TransactionDto;
import com.example.Transaccional.endpoint.dto.TransactionResponseDTO;
import com.example.Transaccional.service.TransactionalService;
import lombok.AllArgsConstructor;
import lombok.Generated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@Generated
@RestController
public class TransactionController {
    private TransactionalService transactionalService;
    @PostMapping(path = "/transaction/transfer-money")
    public TransactionResponseDTO doTransaction(@RequestBody TransactionDto transactionDto) {
        return transactionalService.doTransaction(transactionDto);
    }
    @PutMapping(path = "/transaction/deposit-money")
    public AccountResponseDTO depositMoney(@RequestBody DepositMoneyUserDto depositMoneyUserDto) {
        return transactionalService.depositMoney(depositMoneyUserDto);
    }
}
