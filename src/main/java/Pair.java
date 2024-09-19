public class Pair <T1,T2>{

    private final T1 first_param;
    private final T2 second_param;

    public Pair(T1 first, T2 second) {
        this.first_param = first;
        this.second_param = second;
    }

    public T1 getFirst_param() {
        return first_param;
    }

    public T2 getSecond_param() {
        return second_param;
    }
    public String toString(){
        return first_param + ". " + second_param;
    }
}
