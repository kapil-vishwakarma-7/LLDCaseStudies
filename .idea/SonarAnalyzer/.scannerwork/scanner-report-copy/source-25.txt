package com.designpattern.behavioural.strategy.GoogleMap;

public class GoogleMap {
    private PathCalculationStrategyFactory pathCalculationStrategyFactory;

    public int findPath(int startX, int startY, int endX, int endY, TransportMode transportMode){
        PathCalculationStrategy pathCalculationStrategy =
                pathCalculationStrategyFactory.getPathCalculationStrategy(transportMode);
        return pathCalculationStrategy.calculatePath(startX,startY,endX,endY);
    }
}
