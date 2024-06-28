public class LearnStaticKeyword {
    public static void main(String[] args) {
        // static = modifier: a single copy of a variable/method is created and shared
        // the class owns the static member.
        LearnStaticKeywordFriendClass friend1 = new LearnStaticKeywordFriendClass("Johnny");
        LearnStaticKeywordFriendClass friend2 = new LearnStaticKeywordFriendClass("Elon");
        // System.out.println(LearnStaticKeywordFriendClass.numOfFriends);
        LearnStaticKeywordFriendClass.displayFriends();
    }
}
