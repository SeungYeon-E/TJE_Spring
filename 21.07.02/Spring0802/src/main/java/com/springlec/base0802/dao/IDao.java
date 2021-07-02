package com.springlec.base0802.dao;

import java.util.ArrayList;

import com.springlec.base0802.dto.ContentDto;

public interface IDao {
	
	//전체검색
	public ArrayList<ContentDto> listDao();
	
	//입력
	public void writeDao(String name, String telno, String address, String email, String relation);
	
	//삭제
	public void deleteDao(String seqno);
	
	//불러오기
	public ContentDto contentDao(String seqno);
	
	//수정
	public void updateDao(String seqno, String name, String telno, String address, String email, String relation);
	
	//전체검색
	public ArrayList<ContentDto> listQuery(String query, String content);
}
