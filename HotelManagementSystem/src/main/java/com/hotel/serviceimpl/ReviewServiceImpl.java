/*
 * package com.hotel.serviceimpl;
 * 
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.hotel.dto.CustomerReviewDto; import
 * com.hotel.entity.CustomerReview; import
 * com.hotel.repository.ReviewRepository; import
 * com.hotel.service.ReviewService; import com.hotel.util.ReviewConverter;
 * 
 * @Service public class ReviewServiceImpl implements ReviewService {
 * 
 * @Autowired ReviewRepository reviewRepository;
 * 
 * @Autowired ReviewConverter reviewConverter; private Object review;
 * 
 * @Override public String createCustomerReview(CustomerReview review) { String
 * message=null; reviewRepository.save(review); if(review!=null) {
 * message="reviews are saved successfully"; } return message; }
 * 
 * @Override public CustomerReviewDto getReviewByRating(int rating) {
 * CustomerReview getR= reviewRepository.findByRating(rating).get(rating);
 * return reviewConverter.convertToCustomerReviewDto(getR);
 * 
 * }
 * 
 * @Override public List<CustomerReviewDto> getAllReviews() {
 * List<CustomerReview> reviews = reviewRepository.findAll();
 * 
 * List<CustomerReviewDto> rdto= new ArrayList<>(); for(CustomerReview cr:
 * reviews) { rdto.add(reviewConverter.convertToCustomerReviewDto(cr)); } return
 * rdto; }
 * 
 * 
 * public String deleteReviewByFeedback(String feedback ) { String message =
 * null; List<CustomerReview> delR =
 * reviewRepository.deleteReviewByFeedback(feedback); if(review!=null) {
 * reviewRepository.deleteReviewByFeedback(feedback);
 * message="service feedback delete successfully"; } else {
 * message="Service feedback not found"; } return message;
 * 
 * } }
 */
