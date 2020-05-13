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
        this.finalPosition = new Position(environment.getWidth()-1,environment.getLength()-1);
        this.currentPosition = new Position(0,0);
    }

    @Override
    public void setStartPosition(Position position) throws RobotException {
        if (position.getRow() > environment.getWidth() ||
            position.getCol() > environment.getLength() ||
            position.getRow() < 0 || position.getCol() < 0)
                throw new RobotException("Posição inicial inválida - Fora dos limites da área.");
        else
            this.initialPosition = position;
    }

    @Override
    public void setFinalPosition(Position position) throws RobotException {
        if (position.getRow() >= environment.getWidth() ||
            position.getCol() >= environment.getLength() ||
            position.getRow() < 0 || position.getCol() < 0)
                throw new RobotException("Posição final inválida - Fora dos limites da área.");
        else
            this.finalPosition = position;
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
        System.out.println("\nO robô está na posição "+ getCurrentPosition() +'.');
    }
}