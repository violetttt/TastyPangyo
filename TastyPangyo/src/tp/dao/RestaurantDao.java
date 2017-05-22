package tp.dao;

import java.util.List;

import tp.vo.Restaurant;

public interface RestaurantDao {

	int insertRestaurant(Restaurant restaurant);		// 맛집등록
	int updateRestaurant(Restaurant restaurant);		// 맛집수정
	int removeRestaurant(String restaurantName);	// 맛집삭제 
	
	Restaurant findRestaurantById(String restaurantId);							// 음식점번호로 맛집 조회
	List<Restaurant> findRestaurantBySort(String sort);					// 음식종류로 맛집List 조회
	List<Restaurant> findRestaurantByLocation(String location);			// 위치로 맛집List 조회
	List<Restaurant> findRestaurantByName(String restaurantName);	// 이름으로 맛집List 조회

	Restaurant randomPick();		// 맛집 랜덤 조회
}
