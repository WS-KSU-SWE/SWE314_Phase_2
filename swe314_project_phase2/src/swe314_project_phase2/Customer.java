package swe314_project_phase2;

public class Customer {
	
	private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private String occupation;
    private double salary;
    private String password;

    private DoubleLinkedList<Account> accounts;

    public Customer(int id, String name, String phoneNumber, String address,
                    String occupation, double salary, String password) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.occupation = occupation;
        this.salary = salary;
        this.password = password;
        this.accounts = new DoubleLinkedList<>();
    }

    public void updateProfile(String name, String phoneNumber,
                              String address, String occupation,
                              double salary) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.occupation = occupation;
        this.salary = salary;
    }

    public void updatePassword(String password) {
        this.password = password;
    }

    public void addAccount(long accountNumber, byte cvv,
                           String expirationDate, AccountType type) {
        Account acc = new Account(accountNumber, cvv, expirationDate, type);
        accounts.insert(acc);
    }

    public DoubleLinkedList<Account> getAccounts() {
        return accounts;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getOccupation() { return occupation; }
    public void setOccupation(String occupation) { this.occupation = occupation; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
	
}
