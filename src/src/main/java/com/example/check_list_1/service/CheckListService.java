package com.example.check_list_1.service;

import com.example.check_list_1.domain.CheckList;
import com.example.check_list_1.dto.request.AddCheckListRequest;
import com.example.check_list_1.dto.response.CheckListResponese;
import com.example.check_list_1.repository.CheckListRepository;
import org.springframework.stereotype.Service;
@Service //빈 등록
public class CheckListService {

  CheckListRepository checkListRepository;
  public CheckList save(AddCheckListRequest request){
    return checkListRepository.save(request.toEntity());
  }

  public CheckList findById(long id) {
    return checkListRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("not found" + id));
  }

}
