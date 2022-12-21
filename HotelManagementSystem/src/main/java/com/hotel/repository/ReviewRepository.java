/*
 * package com.hotel.repository;
 * 
 * 
 * import java.util.List;
 * 
 * import org.springframework.data.jpa.repository.JpaRepository; import
 * org.springframework.data.jpa.repository.Query; import
 * org.springframework.data.repository.query.Param;
 * 
 * import com.hotel.entity.CustomerReview;
 * 
 * public interface ReviewRepository extends JpaRepository<CustomerReview ,
 * Integer>{
 * 
 * @Query("from CustomerReview where rating=:r") List<CustomerReview>
 * findByRating(@Param("r") int rating);
 * 
 * //@Query("from CustomerReview where feedback=:f") //List<CustomerReview>
 * findByFeedback(@Param("f") String feedback);
 * 
 * @Query("from CustomerReview where feedback=:f") List<CustomerReview>
 * deleteReviewByFeedback(@Param("f") String feedback);
 * 
 * }
 */