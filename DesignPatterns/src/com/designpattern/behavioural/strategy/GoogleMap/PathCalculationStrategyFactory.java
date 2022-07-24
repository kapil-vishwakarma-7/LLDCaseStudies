package com.designpattern.behavioural.strategy.GoogleMap;

import java.security.InvalidParameterException;

public class PathCalculationStrategyFactory {

    PathCalculationStrategy getPathCalculationStrategy(TransportMode transportMode) {
        switch (transportMode) {
            case CAR:
                return new CarPathCalculation();
            case BIKE:
                return new BikePathCalculation();
            case WALK:
                return new WalkPathCalculation();
        }
        throw new InvalidParameterException("Invalid transport mode");
    }
}
