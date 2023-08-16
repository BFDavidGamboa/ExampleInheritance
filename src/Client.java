import java.util.Date;
public class Client extends Person {
    private int clientId;
    private Date registerDate;
    private boolean vip;
    private  static  int clientsCount;

    public Client(Date registerDate, boolean vip) {
        this.clientId = ++clientsCount;
        this.registerDate = registerDate;
        this.vip = vip;
    }

    public int getClientId() {
        return clientId;
    }



    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getClientsCount() {
        return clientsCount;
    }

    @Override
    public String toString() {
        return super.toString() + "Client{" +
                "clientId=" + clientId +
                ", registerDate=" + registerDate +
                ", vip=" + vip +
                '}';
    }
}
