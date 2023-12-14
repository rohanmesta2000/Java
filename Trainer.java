class Trainer{
	static void introduction()
	{
		System.out.println("I am traineer");
	}
	static void train()
	{
		System.out.println("i am train");
	}
	static void trainer(String traineerName, int salary)
	{
		System.out.println("Traineer Name :" + traineerName);
		System.out.println("Traineer Salary:"  +salary);
	}
	static void trainer(String subject) {
    System.out.println("Today, I will teach you about " + subject);
    }
  
     static void demonstrate(String skill) {
    System.out.println("I will demonstrate " + skill);
    }
  
    static void provideFeedback(String feedback) {
    System.out.println("Here is my feedback: " + feedback);
   }
  
   static void assignHomework(String assignment)
   {
    System.out.println("Your homework is to complete " + assignment);
  }
  
    static void conductQuiz() {
    System.out.println("Let's start the quiz!");
  }
    static void answerQuestions(int numQuestions) {
    System.out.println("I will answer " + numQuestions + " questions.");
  }
  
  static void givePresentation(String topic) {
    System.out.println("Today's presentation is about " + topic);
  }
}