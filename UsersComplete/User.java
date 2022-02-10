public class User {

  private String firstName;
  private String lastName;
  private String email;
  private int balance;
  private boolean flagged;

  public User(
    String firstName,
    String lastName,
    String email,
    int balance,
    boolean flagged)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.balance = balance;
    this.flagged = flagged;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getEmail() {
    return this.email;
  }

  public int getBalance() {
    return this.balance;
  }

  public boolean isFlagged() {
    return this.flagged;
  }

  public String toString() {
    return String.format(
      "%s %s (%s)",
      this.firstName,
      this.lastName,
      this.email
    );
  }

}
