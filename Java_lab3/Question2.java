/**
 * @author : Raj Karan Singh Chhabra
 */
class Answer{
    Answer(){
        System.out.println("You got nothing!"); 
    }
    Answer(int marks){
        this();
        System.out.println("You got "+marks+" for an MCQ");
    }
}
class Question{
    public void main(){
        Answer obj = new Answer(10);
    }
}

public class Question2{
    public static void main (String[] args){
        Question object = new Question();
        object.main();
    }
}