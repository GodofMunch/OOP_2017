public class Email {

    private String sender,recipient;

    public String getSender(){return sender;}

    public String getRecipient() { return recipient; }

    public void setRecipient(String recipient) { this.recipient = recipient; }

    public void setSender(String sender) { this.sender = sender; }

    public Email(String sender, String recipient){

        setSender(sender);
        setRecipient(recipient);
    }

    public String toString() {
        return String.format("%-20s%-20s\n\n%-20s%-20s","Sender:", sender, "Recipient:", recipient);
    }
}
