import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.Date;



public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o dados do cliente: ");
        System.out.print("Diga o nome do cliente: ");
        String name = sc.nextLine();
        System.out.print("Diga o email do cliente: ");
        String email = sc.nextLine();
        System.out.print("BirthDate (dd/MM/yyyy): ");
        Date birthDate = sdf.parse(sc.nextLine());
        
        Cliente cliente = new Cliente(name, email, birthDate);
        
       
        System.out.println("Enter order date");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(), status, cliente);


        System.out.print("Quantos Produtos vão ser: ");
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            System.out.println("Entre # " + i + " item data: ");
            System.out.print("Product Name: ");
            sc.nextLine();
            String productname = sc.nextLine();
            System.out.print("Product Price: ");
            Double productprice = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();
            
            Product product = new Product(productname, productprice);

            OrderItem orderitem = new OrderItem(quantity, productprice, product);
            order.addItem(orderitem);
        }
        System.out.println();
        System.out.println(order);
        sc.close();

    }

}
