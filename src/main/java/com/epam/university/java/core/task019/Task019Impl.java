package com.epam.university.java.core.task019;

public class Task019Impl implements Task019 {
    @Override
    public void invokeAction(Robot robot, RobotCommand command) {
        robot.invokeAction(command);
    }

    @Override
    public boolean isOnStartPosition(Robot robot) {
        return ((RobotImpl) robot).getInitialRobotPosition()
                .equals(robot.getPosition());
    }
}