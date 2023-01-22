public class Mac extends Computer{

    public Mac(int RAM, int memory) {
        super(RAM, memory);
    }

    @Override
    void start() {
        System.out.println("Starting MAC");
    }

    @Override
    void shutdown() {
        System.out.println("Shutdown MAC");
    }

    @Override
    public <T> void GenericMethod(T t) {
        if(t instanceof String)
            System.out.printf("It is an string : %s \n", t);
        else if(t instanceof Integer)
            System.out.printf("It is an integer : %d \n", t);
    }

    @Override
    public <T> void GenericMethod2() {
    }

    @Override
    public int GetRam()
    {
        return super.RAM + 1;
    }
}
