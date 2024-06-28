public class LearnStaticKeywordFriendClass {
    String name;
    static int numOfFriends; // all instances of the class share this filed.

    LearnStaticKeywordFriendClass(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have " + numOfFriends + " friends.");
    }
}
