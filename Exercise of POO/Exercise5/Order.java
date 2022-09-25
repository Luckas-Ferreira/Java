package Exercise5;

import java.sql.Date;

public class Order {
    private Date        moment;
    private OrderStatus status;

    public Order(Date; OrderStatus; Client){
        this.Date = Date;
        this.OrderStatus = OrderStatus;
        this.Client = Client;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){

    }
    public void removeItem(OrderItem item){

    }
    public double total(){
        return 0;
    }
}
