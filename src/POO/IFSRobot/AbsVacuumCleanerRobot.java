package POO.IFSRobot;

public abstract class AbsVacuumCleanerRobot extends AbsBasicRobot implements IVacuumCleaner{
    // ATRIBUTOS
    private boolean switchedOn;

    // CONSTRUTORES
    public AbsVacuumCleanerRobot(Environment environment) {
        super(environment);
    }

    // METODOS
    public void turnOn() {
        this.switchedOn = true;
    }

    public void turnOff() {
        this.switchedOn = false;
    }

    public boolean isDirty() {
        return environment.getValue(getCurrentPosition()) == 'S';
    }

    public void clear() {
        this.environment.setValue(getCurrentPosition(),' ');
    }

    public boolean isSwitchedOn(){
        return switchedOn;
    }
}