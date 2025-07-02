import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> p = new ArrayList<Product>();
        String date2;
        LocalDate date;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        double fee;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Products: ");
        int num = sc.nextInt();
        sc.nextLine();
        for(int i = 1;i< num + 1;i++){
            System.out.printf("Product #%d data: \n",i);
            System.out.print("Common,Used or Imported(c/u/i)? ");
            char x = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            if(x == 'u' ){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                date2 = sc.nextLine();
                date = LocalDate.parse(date2,formatter);
                UsedProduct produto = new UsedProduct(name,price,date);
                p.add(produto);
            } else if (x == 'i') {
                System.out.print("Customs Fee: ");
                fee = sc.nextDouble();
                ImportedProduct produto = new ImportedProduct(name,price,fee);
                p.add(produto);
            } else if (x == 'c') {
                Product produto = new Product(name,price);
                p.add(produto);
            }

        }
        System.out.println("Price Tags");
        for(Product q: p){
            System.out.println(q.priceTag());
        }

    }
}