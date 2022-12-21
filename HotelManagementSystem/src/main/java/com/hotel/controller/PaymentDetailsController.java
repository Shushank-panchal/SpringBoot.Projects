/*
 * package com.hotel.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.hotel.dto.PaymentDetailsDto; import
 * com.hotel.entity.PaymentDetails; import
 * com.hotel.service.PaymentDetailsService; import
 * com.hotel.util.PaymentDetailsConverter;
 * 
 * @RestController
 * 
 * @RequestMapping("/pay") public class PaymentDetailsController {
 * 
 * @Autowired public PaymentDetailsService paymentdetailsservice;
 * 
 * @Autowired public PaymentDetailsConverter paymentdetailsconverter;
 * 
 * @PostMapping("/createPaymentDetails") public String
 * createPaymentDetails(@RequestBody PaymentDetailsDto paymentdetailsdto) {
 * final PaymentDetails paymentdetails =
 * paymentdetailsconverter.convertToEntity(paymentdetailsconverter); return
 * paymentdetailsservice.createPaymentDetails(paymentdetails); }
 * 
 * @PutMapping("/updatePaymentDetails/{identity}") public PaymentDetailsDto
 * updatePaymentDetails(@PathVariable("identity") int pid,
 * 
 * @RequestBody PaymentDetailsDto paymentdetailsdto) { PaymentDetails
 * paymentdetails =
 * paymentdetailsconverter.convertToEntity(paymentdetailsconverter); return
 * paymentdetailsservice.updatePaymentDetails(pid, paymentdetails); }
 * 
 * @GetMapping("/getCustomerByID/{identity}") public PaymentDetailsDto
 * getPaymentDetailsById(@PathVariable("identity") int pid) {
 * 
 * return paymentdetailsservice.getPaymentDetailsById(pid); }
 * 
 * @DeleteMapping("/deletePaymentDetailsById/{id}") public String
 * deletePaymentDetailsById(@PathVariable("id") int pid) { return
 * paymentdetailsservice.deletePaymentDetailsById(pid);
 * 
 * }
 * 
 * @DeleteMapping("/deleteAllPayments") public void deleteAllPayments() {
 * paymentdetailsservice.deleteAllPayments(); } }
 */