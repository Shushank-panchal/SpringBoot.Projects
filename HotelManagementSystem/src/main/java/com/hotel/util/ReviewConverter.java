/*
 * package com.hotel.util;
 * 
 * import org.springframework.beans.BeanUtils; import
 * org.springframework.stereotype.Component;
 * 
 * import com.hotel.dto.CustomerReviewDto; import
 * com.hotel.entity.CustomerReview;
 * 
 * 
 * @Component public class ReviewConverter {
 * 
 * public CustomerReview convertToCustormerReviewEntity(CustomerReviewDto
 * reviewDto) { CustomerReview review= new CustomerReview(); if(review!=null) {
 * BeanUtils.copyProperties(reviewDto, review); } return review; }
 * 
 * 
 * public CustomerReviewDto convertToCustomerReviewDto(CustomerReview review) {
 * CustomerReviewDto reviewDto = new CustomerReviewDto(); if(reviewDto!=null) {
 * BeanUtils.copyProperties(review, reviewDto); } return reviewDto; } }
 */
