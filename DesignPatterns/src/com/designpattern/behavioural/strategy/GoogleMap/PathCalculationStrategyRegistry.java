package com.designpattern.behavioural.strategy.GoogleMap;

import java.util.Map;

public class PathCalculationStrategyRegistry {
    private Map<TransportMode, PathCalculationStrategy> pathCalculationStrategyMap;

    public void registry(TransportMode transportMode, PathCalculationStrategy pathCalculationStrategy){
        pathCalculationStrategyMap.put(transportMode, pathCalculationStrategy);
    }

    public PathCalculationStrategy getPathCalculationStrategy(TransportMode transportMode){
        return pathCalculationStrategyMap.get(transportMode);
    }
}
