import java.io.*;
import java.lang.*;
import java.util.*;

class one {
    public void print_name() {
        System.out.println(" Somak Poddar ");
    }
}

class two extends one {

    public void print_stream() {
        System.out.println(" Computer Science & Engineering ");
    }
}

class three extends two {
    public void print_roll() {
        System.out.println(" 11200220018 ");
    }
}

public class Mainthing {
    public static void main(String[] args) {
        three s = new three();
        s.print_name();
        s.print_stream();
        s.print_roll();
    }
}
