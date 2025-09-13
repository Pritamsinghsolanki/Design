package org.example.SnakeAndLadder.model;

import org.example.SnakeAndLadder.enums.ObstacleType;

public class Snake extends Obstacle{
    public Snake(int head, int tail){
        super(head,tail);
    }

    @Override
    public ObstacleType getObstacleType() { return ObstacleType.SNAKE;}

}
