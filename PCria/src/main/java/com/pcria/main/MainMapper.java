package com.pcria.main;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pcria.access.model.AccessVO;
import com.pcria.main.model.FoodVO;
import com.pcria.main.model.SeatDMI;
import com.pcria.main.model.SeatVO;

@Mapper
public interface MainMapper {
	//먹거리 주문 관련 
	List<FoodVO> selFoodList(FoodVO param);
	List<FoodVO> selPopularFoodList(FoodVO param);
	
	//좌석 관련
	List<SeatDMI> selSeat();
	int insSeat(SeatDMI param);
	int updSeat(SeatDMI param);
	int delSeat(AccessVO param);
	
	//좌석 관련 -> 로그인 세션 삽입
	AccessVO selLoginUserSeat(int param);
	
	//파일 등록
	int updProfile(AccessVO param);
	
	//프로필 기타 정보 가져오기
	AccessVO ajaxSelMyInfo(int u_no);
	List<FoodVO> ajaxSelMyOrderList(int u_no);
}
