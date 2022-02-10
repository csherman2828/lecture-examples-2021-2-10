public class UserDatabase {

  private User[] users;

  public UserDatabase() {
    users = new User[4];
    this.users[0] = new User("Person", "A", "person.a@example.com", 1200, false);
    this.users[1] = new User("Person", "B", "person.b@example.com", 4800, true);
    this.users[2] = new User("Person", "C", "person.c@example.com", 0, true);
    this.users[3] = new User("Person", "D", "person.d@example.com", 0, false);
  }

  // look through the users "database" for a user with a matching email
  public User find(String email) {
    for(int i = 0; i < this.users.length; ++i) {
      if(this.users[i].getEmail() == email) return this.users[i];
    }

    return null;
  }

}
