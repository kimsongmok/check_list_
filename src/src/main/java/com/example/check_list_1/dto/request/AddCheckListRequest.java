package com.example.check_list_1.dto.request;

import com.example.check_list_1.domain.CheckList;

public class AddCheckListRequest {

  private String title;

  public AddCheckListRequest(String title) {
    this.title = title;
  }
  public CheckList toEntity(){
    return CheckList.builder()
            .title(title)
            .build();
  }
}
