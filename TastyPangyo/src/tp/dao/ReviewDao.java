package tp.dao;

import java.util.List;

import tp.vo.Review;

public interface ReviewDao {

	int insertReview(Review review);					// 리뷰 등록
	int updateReview(Review review);				// 리뷰 수정
	int removeReviewByUser(String title);			// 제목으로 리뷰 삭제 - 사용자
	int removeReviewByAdmin(String slang);		// 특정단어(비속어)가 포함된 리뷰 삭제 - 관리자
	
	List<Review> findReviewByTitle(String title);							// 제목으로 리뷰List 조회
	List<Review> findReviewByWord(String slang);						// 특정단어로 리뷰List 조회
	List<Review> findReviewByWriter(String writer);						// 작성자로 리뷰List 조회
	List<Review> findReviewByRestaurant(String restaurant);			// 맛집으로 리뷰List 조회
	//List<Review> selectReviewByKostar(int kostar);						// 별점으로 리뷰List 조회

}
