package com.neeraj.service;

import java.util.List;

import com.neeraj.beans.HistoryBean;
import com.neeraj.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
