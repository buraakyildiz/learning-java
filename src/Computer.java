public abstract class Computer {

    int RAM;
    int Memory;

    public Computer(int RAM, int memory) {
        this.RAM = RAM;
        Memory = memory;
    }

    abstract void start();
    abstract void shutdown();

    abstract <T> void GenericMethod(T t);
    abstract <T> void GenericMethod2();

    public int GetRam()
    {
        return RAM;
    }
}

