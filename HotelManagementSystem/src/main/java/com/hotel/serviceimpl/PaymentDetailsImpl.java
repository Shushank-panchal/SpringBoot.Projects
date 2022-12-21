/*
 * package com.hotel.serviceimpl;
 * 
 * import java.util.ArrayList; import java.util.List; import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.hotel.dto.PaymentDetailsDto; import
 * com.hotel.entity.PaymentDetails; import
 * com.hotel.repository.PaymentDetailsRepository; import
 * com.hotel.service.PaymentDetailsService; import
 * com.hotel.util.PaymentDetailsConverter;
 * 
 * @Service public class PaymentDetailsImpl implements PaymentDetailsService {
 * 
 * @Autowired public PaymentDetailsRepository paymentdetailsrepository;
 * 
 * @Autowired public PaymentDetailsConverter paymentdetailsconverter;
 * 
 * @Override public String createPaymentDetails(PaymentDetails paymentdetails) {
 * String message = null; paymentdetailsrepository.save(paymentdetails); if
 * (paymentdetails != null) { message = "payment details saved successfully"; }
 * return message;
 * 
 * }
 * 
 * @Override public PaymentDetailsDto updatePaymentDetails(int pid,
 * PaymentDetails payment1) { PaymentDetails existingpayment =
 * paymentdetailsrepository.findById(pid).get();
 * existingpayment.setCustomername(payment1.getCustomername());
 * existingpayment.setFacility(payment1.getFacility());
 * existingpayment.setPaymentdate(payment1.getPaymentdate());
 * existingpayment.setRoomno(payment1.getRoomno());
 * existingpayment.setTotalamount(payment1.getTotalamount());
 * paymentdetailsrepository.save(existingpayment);
 * 
 * return PaymentDetailsConverter.convertToPaymentDetails(existingpayment); }
 * 
 * @Override public PaymentDetailsDto getPaymentDetailsById(int pid) {
 * PaymentDetails getPaymentById = paymentdetailsrepository.findById(pid).get();
 * return PaymentDetailsConverter.convertToPaymentDetails(getPaymentById);
 * 
 * }
 * 
 * @Override public List<PaymentDetailsDto> getAllCustomers() {
 * List<PaymentDetails> payments = paymentdetailsrepository.findAll();
 * List<PaymentDetailsDto> pdto = new ArrayList<>(); for (PaymentDetails p :
 * payments) { pdto.add(PaymentDetailsConverter.convertToPaymentDetails(p)); }
 * return pdto; }
 * 
 * @Override public String deletePaymentDetailsById(int pid) { String message =
 * null; Optional<PaymentDetails> address =
 * paymentdetailsrepository.findById(pid); if (address.isPresent()) {
 * paymentdetailsrepository.deleteById(pid); message =
 * "payment details delete successfully"; } else { message =
 * "payment details not found"; } return message;
 * 
 * }
 * 
 * @Override public void deleteAllPayments() {
 * paymentdetailsrepository.deleteAll();
 * 
 * }
 * 
 * }
 */