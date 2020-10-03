package Ejercicio2;

/**
 * The type Email.
 */
public class Email {

    private String account;
    private String domain;

    /**
     * Instantiates a new Email.
     *
     * @param email the email
     */
    public Email(String email) {
        String[] splittedEmail = email.split("@");
        this.account = splittedEmail[0];
        this.domain = splittedEmail[1];
    }

    /**
     * Gets account.
     *
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Gets domain.
     *
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets domain.
     *
     * @param domain the domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return this.getAccount() + "@" + this.getDomain();
    }
}
