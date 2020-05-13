package POO.IFSRobot;

public class LeftRigthVacuumCleanerRobot extends AbsVacuumCleanerRobot{
    // CONSTRUTOR
    public LeftRigthVacuumCleanerRobot(Environment environment) {
        super(environment);
    }
    // METODOS
    @Override
    public Position move() {

        if (currentPosition.getCol() + 1 < environment.getWidth()){
            currentPosition.setCol(currentPosition.getCol() + 1);
            return currentPosition;
        }else {
            currentPosition.setCol(0);
            currentPosition.setRow(currentPosition.getRow() + 1);
            return currentPosition;
        }
    }
}