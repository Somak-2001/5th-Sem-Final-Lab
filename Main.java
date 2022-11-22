import java.io.*;
import java.lang.*;
import java.util.*;

class one {
    public void print_name() {
        System.out.println("Somak");
    }
}

class two extends one {
    public void print_stream() {
        System.out.println("Computer Science & Engineering");
    }
}

public class Main {
    public static void main(String[] args)

    {
        two g = new two();
        g.print_name();
        g.print_stream();
        g.print_name();
    }
}
