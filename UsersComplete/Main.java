public class Main {
  public static void main(String[] args) {
    UserDatabase db = new UserDatabase();
    String[] emails = {
      "person.b@example.com",
      "person.c@example.com",
      "person.d@example.com",
      "person.e@example.com"
    };

    // // Example of how to use db in this context
    // User example = db.find("person.a@example.com");

    // start here
    User currentUser;
    for(int i = 0; i < emails.length; i++) {
      currentUser = db.find(emails[i]);

      // if(currentUser == null)
      if(currentUser == null) {
        System.out.println("No user found for " + emails[i]);
        continue;
      }

      // if(currentUser.isFlagged() == true)
      if(currentUser.isFlagged()) {
        System.out.println("Account for " + currentUser + " has been flagged.");
      }

      if(currentUser.getBalance() > 0) {
        System.out.println(
          "Account for "
          + currentUser
          + " has an outstanding balance: "
          + currentUser.getBalance()
        );
      }
    }
  }
}
