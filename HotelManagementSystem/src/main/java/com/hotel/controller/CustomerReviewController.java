/*
 * package com.hotel.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.hotel.dto.CustomerReviewDto; import
 * com.hotel.entity.CustomerReview; import com.hotel.service.ReviewService;
 * import com.hotel.util.ReviewConverter;
 * 
 * @RestController
 * 
 * @RequestMapping("/api") public class CustomerReviewController {
 * 
 * @Autowired ReviewService reviewService;
 * 
 * @Autowired ReviewConverter reviewConverter;
 * 
 * @PostMapping("/createCustomerReview") public String
 * createCustomerReview(@RequestBody CustomerReviewDto reviewDto) { final
 * CustomerReview review =
 * reviewConverter.convertToCustormerReviewEntity(reviewDto); return
 * reviewService.createCustomerReview(review); }
 * 
 * @GetMapping("/getReviewByRating/{rating}") public CustomerReviewDto
 * getReviewByRating(@PathVariable("rating") int rating) { return
 * reviewService.getReviewByRating(rating); }
 * 
 * @GetMapping("/getAllReviews") public List<CustomerReviewDto> getAllReviews()
 * { return reviewService.getAllReviews(); } }
 */