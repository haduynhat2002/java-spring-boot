package com.example.t2009m1javaspingboot.repository;

import com.example.t2009m1javaspingboot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
