package com.example.check_list_1.controller;

import com.example.check_list_1.domain.CheckList;
import com.example.check_list_1.dto.request.AddCheckListRequest;
import com.example.check_list_1.dto.response.CheckListResponese;
import com.example.check_list_1.service.CheckListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //빈 등록

public class CheckListController {

  CheckListService checkListService;

  @PostMapping("/api/CheckLists")
  public ResponseEntity<CheckList> addCheckList(@RequestBody AddCheckListRequest request){
    CheckList checkList = checkListService.save(request);

    return ResponseEntity.ok()
            .body(checkList);
  }

  @GetMapping("/api/checkLists/{id}")
  public ResponseEntity<CheckListResponese> findCheckList(@PathVariable long id) {
    CheckList findCheckList = checkListService.findById(id);

    return ResponseEntity.ok()
            .body(new CheckListResponese(findCheckList));
  }

}
