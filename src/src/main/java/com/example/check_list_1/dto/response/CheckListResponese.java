package com.example.check_list_1.dto.response;

import com.example.check_list_1.domain.CheckList;

public class CheckListResponese {

  private String title;

  public CheckListResponese(CheckList checkList) {
    this.title = checkList.getTitle();
  }
}
