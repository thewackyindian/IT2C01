/**
 * @author : Raj Karan Singh Chhabra
 */
class Study {
    public void time_Duration() {
        System.out.println("Study is a lifetime duration course and you will learn new things everyday.");
    }
}

class Btech extends Study {
    public void time_Duration() {
        System.out.println("Btech is a 4 year duration course and has a prerequisite which is Senior Secondary.");
    }
}

class Mtech extends Study {
    public void time_Duration() {
        System.out.println("Mtech is a 2 year duration course and has a prerequisite which is a Bachelor Degree.");
    }
}

class Phd extends Study {
    public void time_Duration() {
        System.out.println("Phd is a 5 year duration course and has a prerequisite which is a Master Degree.");
    }
}

public class Question2{
    public static void main(String[] args) {
        Study std = new Study();
        Btech btech = new Btech();
        Mtech mtech = new Mtech();
        Phd phd = new Phd();
        phd.time_Duration();
        mtech.time_Duration();
        btech.time_Duration();
        std.time_Duration();
    }
}