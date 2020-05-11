package POO.IFSRobot;

public interface IRobot {

    //  METODOS
    void setStartPosition(Position position) throws RobotException;
    void setFinalPosition(Position position) throws RobotException;
    void printPosition();
    Position getCurrentPosition();
    Position move();
}
