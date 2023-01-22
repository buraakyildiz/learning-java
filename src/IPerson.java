public interface IPerson {
    public void Talk();
    public void Walk();
    default void PMethod(){
        System.out.println("Do something !");
    }

 }
