/* 
 * There is no need to update the logic in this file. The main method only exists so you can see the output of your logic without running the tests
 * 
 * Please go to "OtherStringMethods.java" to complete the lab. 
 * 
 */
public class Main {

    public static void main(String[] args) {
        //NOTE: The values below will be incorrect until you update OtherStringMethods.java with the correct logic
        OtherStringMethods osm = new OtherStringMethods();
        String str = "Revature";

        

        //Substrings
        System.out.println("\nSubstrings...");
        System.out.println("Given the string value '" + str  + "'...");
        System.out.println("The substring between index 2 (inclusive) and 5 (exclusive) should return 'vat', Actual output: " + osm.partOfString(str, 2, 5));
        System.out.println("Actual Tests");
        str="banana";
        System.out.println("\nSubstrings...");
        System.out.println("Given the string value '" + str  + "'...");
        System.out.println("The substring between index 0 (inclusive) and 3 (exclusive) should return 'ban', Actual output: " + osm.partOfString(str, 0, 3));
        str="apple";
        System.out.println("\nSubstrings...");
        System.out.println("Given the string value '" + str  + "'...");
        System.out.println("The substring between index 1 (inclusive) and 5 (exclusive) should return 'pple', Actual output: " + osm.partOfString(str, 1, 5));

        //Comparisons
        System.out.println("\nComparisons...");
        System.out.println("Comparing the string 'revature' to 'Revature', Expected Output: a positive number,  Actual output: " + osm.compareLexigraphically("revature", "Revature"));
        System.out.println("Comparing the string 'Revature' to 'revature', Expected Output: a negative number,  Actual output: " + osm.compareLexigraphically("Revature", "revature"));
        System.out.println("Comparing the string 'Revature' to 'Revature', Expected Output: 0,  Actual output: " + osm.compareLexigraphically(str, str));
        System.out.println("Actual Tests");
        System.out.println("Banana is after apple in the dictionary, so compareTo should return a value greater than 0: " + osm.compareLexigraphically("banana", "apple"));
        System.out.println("Monkey is before penguin in the dictionary, so compareTo should return a value less than 0: "+ osm.compareLexigraphically("monkey", "penguin"));
        System.out.println("java is equivalent to java, so compareTo should return 0: " + osm.compareLexigraphically("java", "java"));
        
        //Splitting string
        System.out.println("\nString splitting...");
        System.out.println("Splitting all the words in the sentence 'Software Development Lifecycle'\n\nExpected Output: ");
        System.out.println("Software\nDevelopment\nLifecycle\n\nActual Output: ");

        String words[] = osm.splitStringIntoMultipleStrings("Software Development Lifecycle", " ");
        if(words == null) {
            System.out.println("null");
        }else{
            for(String word : words){
                System.out.println(word);
            }
        }

        System.out.println("Actual Tests");
        System.out.println("\'banana apple pear\' split around \' \' should return {\'banana\', \'apple\', \'pear\'}");
        String words2[] = osm.splitStringIntoMultipleStrings("banana apple pear", " ");
        if(words2 == null){
            System.out.println("null");
        }
        else{
            for(String word : words2){
                System.out.println(word);
            }
        }
        System.out.println("\'src.main.java\' split around \'.\' should return {\'src\', \'main\', \'java\'}.");
        //the two backwards slashes prevent the period from being interpreted as a regex expression
        String words3[] = osm.splitStringIntoMultipleStrings("src.main.java", "\\.");
        if(words3 == null){
            System.out.println("null");
        }
        else{
            for(String word : words3){
                System.out.println(word);
            }
        }
        
        
    }
    
}
