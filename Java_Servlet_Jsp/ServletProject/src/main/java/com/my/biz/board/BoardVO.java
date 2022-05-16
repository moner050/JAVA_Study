package com.my.biz.board;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardVO {

	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
	
}
