package com.parking.strategy.ParkingFeeCalculationStartegy;

import com.parking.entity.Ticket;
import com.parking.entity.VehicleType;

import java.util.Date;

public class CarParkingFeeCalculationStrategy implements ParkingFeeCalculationStrategy{
    @Override
    public Double calculate(Ticket ticket, VehicleType vehicleType, Date exitTime) {
        return 0.00;
    }
}
