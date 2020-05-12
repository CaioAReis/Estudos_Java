package POO.IFSRobot;

public abstract class AbsBasicRobot implements IRobot{

    // ATRIBUTOS
    protected Environment environment;
    protected Position currentPosition;
    protected Position initialPosition;
    protected Position finalPosition;

    // CONSTRUTORES
    public AbsBasicRobot(Environment environment) {
        this.environment = environment;
        this.initialPosition = new Position(0,0);
        this.finalPosition = new Position(0,0);
        this.currentPosition = new Position(0,0);
    }

    @Override
    public void setStartPosition(Position position) throws RobotException {

    }

    @Override
    public void setFinalPosition(Position finalPosition) {
        this.finalPosition = finalPosition;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public Position getInitialPosition() {
        return initialPosition;
    }

    public Position getFinalPosition() {
        return finalPosition;
    }

    @Override
    public Position getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public void printPosition() {

    }


}
