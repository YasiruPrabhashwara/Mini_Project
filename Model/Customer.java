package Model;

public class Customer {
    private String fullName;
    private String nic;
    private String destination;
    private String paymentMethod;
    private String specialRequest;

    // Constructors
    public Customer(String fullName, String nic, String destination, String paymentMethod, String specialRequest) {
        this.fullName = fullName;
        this.nic = nic;
        this.destination = destination;
        this.paymentMethod = paymentMethod;
        this.specialRequest = specialRequest;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }
}

