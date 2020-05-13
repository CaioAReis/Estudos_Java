package POO.IFSRobot;

public class Environment {

    // ATRIBUTOS
    private char[][] environment;
    private final int width, length;

    // CONSTRUTORES
    public Environment(char[][] environment) {
        this.environment = environment;
        width = environment.length;
        length = environment[0].length;
    }

    public Environment(int width, int length) {
        this.width = width;
        this.length = length;
        this.environment = new char[this.width][this.length];
    }

    // METODOS
    public char getValue(Position position) {
        return this.environment[position.getRow()][position.getCol()];
    }

    public void setValue(Position position, char value) {
        this.environment[position.getRow()][position.getCol()] = value;
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public void printEnvironment() {
        System.out.println("::: Ambiente :::");
        for (int i = 0; i < getLength(); i++) {
            System.out.print('[');
            for (int j = 0; j < getWidth(); j++)
                System.out.print(environment[j][i] + ", ");
            System.out.print("]\n");
        }
    }

    // EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Environment that = (Environment) o;
        boolean test = false;
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getLength(); j++) {
                if (environment[j][i] == that.environment[j][i])
                    test = true;
                else{
                    test = false;
                    break;
                }
            }
            if (!test)
                break;
        }
        return test;
    }

    // TOSTRING
    @Override
    public String toString() {
        for (int i = 0; i < getLength(); i++) {
            System.out.println('[');
            for (int j = 0; j < getWidth(); j++)
                System.out.println(environment[j][i] + ", ");
            System.out.println("]\n");
        }
        return " ";
    }
}