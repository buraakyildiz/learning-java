package inheritance;

public abstract class Computer {

    int RAM;
    int Memory;

    public Computer(int RAM, int memory) {
        this.RAM = RAM;
        Memory = memory;
    }

    public abstract void start();
    abstract void shutdown();

    public abstract <T> void GenericMethod(T t);
    public abstract <T> void GenericMethod2();

    public int GetRam()
    {
        return RAM;
    }
}

