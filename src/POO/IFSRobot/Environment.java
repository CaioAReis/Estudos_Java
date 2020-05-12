package POO.IFSRobot;

import java.util.Arrays;

public class Environment {

    // ATRIBUTOS
    private char[][] environment;
    private int width, length;

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
        return Arrays.equals(environment, that.environment);
    }

    // TOSTRING
    @Override
    public String toString() {
        StringBuilder amb = new StringBuilder();
        for (int i = 0; i < getLength(); i++) {
            amb.append('[');
            for (int j = 0; j < getWidth(); j++)
                amb.append(environment[j][i]).append(", ");
            amb.append(']').append('\n');
        }
        return amb.toString();
    }
}