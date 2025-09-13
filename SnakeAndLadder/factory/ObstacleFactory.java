package org.example.SnakeAndLadder.factory;

import org.example.SnakeAndLadder.enums.ObstacleType;
import org.example.SnakeAndLadder.model.Ladder;
import org.example.SnakeAndLadder.model.Obstacle;
import org.example.SnakeAndLadder.model.Snake;

public class ObstacleFactory {
    public static Obstacle createObstacle(ObstacleType type, int up, int down){
        return switch (type) {
            case SNAKE -> new Snake(up , down);
            case LADDER -> new Ladder(up, down);
            default -> throw new IllegalArgumentException("Invalid obstacle");
        };
    }
}
