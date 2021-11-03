/**
 * @author : Raj Karan Singh Chhabra
 */
interface Teaching
{
    /* compiler will treat them as: 
    * public abstract void canTeach();
    */
   public void canTeach();
}
interface Research
{
    /* compiler will treat them as: 
    * public abstract void canResearch();
    */
   public void canResearch();
}
interface Evaluate
{
   /* compiler will treat them as: 
    * public abstract void canEval();
    */
    public void canEval();
}
class Faculty implements Teaching , Research, Evaluate
{
   public void canTeach()
   {
	System.out.println("Teacher can teach.");
   }
   public void canResearch()
   {
	System.out.println("Teacher can Research.");
   }
   public void canEval()
   {
	System.out.println("Teacher can Evaluate.");
   }
   
}
class Scholar implements  Research , Evaluate
{
   public void canResearch()
   {
	System.out.println("Scholar can Research.");
   }
   public void canEval()
   {
	System.out.println("Scholar can Evaluate.");
   }
   
}
class Student implements  Research 
{
   public void canResearch()
   {
	System.out.println("Student can Research.");
   }
   
}
class Question3
{
    public static void main(String arg[])
    {
          
        Teaching T = new Faculty();
        T.canTeach();
	     Research obj1 = new Faculty();
	     Research obj2 = new Scholar();
	     Research obj3 = new Student();
	     Evaluate E = new Faculty();
	     Evaluate E1 = new Scholar();
        obj1.canResearch();
        obj2.canResearch();
        obj3.canResearch();
        E.canEval();
        E1.canEval();
    }

}