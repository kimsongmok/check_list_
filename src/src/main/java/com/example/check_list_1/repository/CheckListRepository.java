package com.example.check_list_1.repository;

import com.example.check_list_1.domain.CheckList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckListRepository extends JpaRepository<CheckList, Long> {
}
