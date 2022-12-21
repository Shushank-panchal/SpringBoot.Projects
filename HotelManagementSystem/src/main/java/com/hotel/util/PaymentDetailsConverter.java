/*
 * package com.hotel.util;
 * 
 * import org.springframework.beans.BeanUtils; import
 * org.springframework.stereotype.Component;
 * 
 * import com.hotel.dto.PaymentDetailsDto; import
 * com.hotel.entity.PaymentDetails;
 * 
 * @Component public class PaymentDetailsConverter { // converting
 * paymentdetails to paymentdetailsdto public PaymentDetails
 * convertToEntity(PaymentDetailsConverter paymentdetailsdto) { PaymentDetails
 * paymentdetails = new PaymentDetails(); if (paymentdetailsdto != null) {
 * BeanUtils.copyProperties(paymentdetailsdto, paymentdetails); } return
 * paymentdetails; }
 * 
 * // converting paymentdetailsdto to paymentdetails public static
 * PaymentDetailsDto convertToPaymentDetails(PaymentDetails paymentdetails) {
 * PaymentDetailsDto paymentdetailsdto = new PaymentDetailsDto(); if
 * (paymentdetails != null) { BeanUtils.copyProperties(paymentdetails,
 * paymentdetailsdto); } return paymentdetailsdto; } }
 */