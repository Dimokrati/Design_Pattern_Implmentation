package com.exercice1;


interface Program {
    void go();
}


class Program1 implements Program {
    @Override
    public void go() {
        System.out.println("Je suis le traitement 1");
    }
}

class Program2 implements Program {
    @Override
    public void go() {
        System.out.println("Je suis le traitement 2");
    }
}


class Program3 implements Program {
    @Override
    public void go() {
        System.out.println("Je suis le traitement 3");
    }
}


class Program4 implements Program {
    @Override
    public void go() {
        System.out.println("Je suis le traitement 4");
    }
}


class ProgramFactory {
    public Program createProgram(int programNumber) {
        switch (programNumber) {
            case 1:
                return new Program1();
            case 2:
                return new Program2();
            case 3:
                return new Program3();
            case 4:
                return new Program4();
            default:
                throw new IllegalArgumentException("Numéro de programme non valide");
        }
    }
}


public class Client {
    public static void main(String[] args) {
        ProgramFactory factory = new ProgramFactory();

        mainWithProgramNumber(factory, 1);
        mainWithProgramNumber(factory, 2);
        mainWithProgramNumber(factory, 3);
        mainWithProgramNumber(factory, 4);
    }

    private static void mainWithProgramNumber(ProgramFactory factory, int programNumber) {
        Program program = factory.createProgram(programNumber);
        System.out.println("Je suis le main" + programNumber);
        program.go();
    }
}

