import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Cliente cliente;

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
    public List<OrderItem> getItems() {
        return items;
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Order(){

    }
    public Order(Date moment, OrderStatus status, Cliente cliente) {
        super();
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    public double total(){
        double sum = 0;
        for(OrderItem i : items){
            sum += i.subTotal();
        }
        return sum;
    
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order Status: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Order items: \n");
        for(OrderItem item : items){
            sb.append(item + "\n");
        }
        sb.append("Total Price: $");
        sb.append(String.format("%.2f",total()));
        return sb.toString();

    }
  

}
