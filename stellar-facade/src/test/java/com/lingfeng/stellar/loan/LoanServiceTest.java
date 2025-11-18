package com.lingfeng.stellar.loan;

import com.lingfeng.stellar.StellarServiceTest;
import com.lingfeng.stellar.po.LoanPO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class LoanServiceTest extends StellarServiceTest {

    @Autowired
    private LoanService loanService;

    @Test
    public void crudTest() {
    }
}
