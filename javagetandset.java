public class javagetandset {
    
        /**
     *
     */
    private static final String JOHN = "John";

        public static void main(String[] args) {
          Person myObj = new Person();
          myObj.setName(JOHN); // Set the value of the name variable to "John"
          System.out.println(myObj.getName());
        }
}
      
      // Outputs "John"
