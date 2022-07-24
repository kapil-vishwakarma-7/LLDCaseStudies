package com.parking.strategy.ParkingFeeCalculationStartegy;

import com.parking.entity.Ticket;
import com.parking.entity.VehicleType;

import java.util.Date;

public interface ParkingFeeCalculationStrategy {
    public Double calculate(Ticket ticket, VehicleType vehicleType, Date exitTime);
}
