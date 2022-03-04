import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Invoice;

public class SecondAssignment {

    public static void main(String[] args) {
        String[] customerName = { "John", "Max", "Phil", "Roger", "Yae", "Doe", "William" };

        List<Invoice> invoices = AddDummyData();

        List<Invoice> oracleAndTrainingInvoices = invoices.stream()
                .filter(invoice -> {
                    for (String name : customerName) {
                        if (invoice.getCustomer() == name) {
                            return true;
                        }
                    }
                    return false;
                })
                .filter(invoice -> invoice.getTitle().contains("Training"))
                .sorted(Comparator.comparingInt(Invoice::getAmount)
                        .reversed())
                .collect(Collectors.toList());

        List<Integer> ids = oracleAndTrainingInvoices.stream()
                .map(invoice -> invoice.getId())
                .collect(Collectors.toList());

        List<Integer> firstFiveIds = oracleAndTrainingInvoices.stream()
                .map(invoice -> invoice.getId())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(ids);
        System.out.println(firstFiveIds);

    }

    public static List<Invoice> AddDummyData() {
        List<Invoice> invoices = new ArrayList<>();

        invoices.add(new Invoice());
        invoices.get(0).setCustomer("John");
        invoices.get(0).setId(1);
        invoices.get(0).setAmount(100);
        invoices.get(0).setTitle("Training");

        invoices.add(new Invoice());
        invoices.get(1).setCustomer("Max");
        invoices.get(1).setId(2);
        invoices.get(1).setAmount(200);
        invoices.get(1).setTitle("Training");

        invoices.add(new Invoice());
        invoices.get(2).setCustomer("Phil");
        invoices.get(2).setId(3);
        invoices.get(2).setAmount(100);
        invoices.get(2).setTitle("Training");

        invoices.add(new Invoice());
        invoices.get(3).setCustomer("Roger");
        invoices.get(3).setId(4);
        invoices.get(3).setAmount(110);
        invoices.get(3).setTitle("Training");

        invoices.add(new Invoice());
        invoices.get(4).setCustomer("Doe");
        invoices.get(4).setId(5);
        invoices.get(4).setAmount(100);
        invoices.get(4).setTitle("Training");

        invoices.add(new Invoice());
        invoices.get(5).setCustomer("Yae");
        invoices.get(5).setId(6);
        invoices.get(5).setAmount(100);
        invoices.get(5).setTitle("Training");

        invoices.add(new Invoice());
        invoices.get(6).setCustomer("William");
        invoices.get(6).setId(7);
        invoices.get(6).setAmount(400);
        invoices.get(6).setTitle("Training");

        invoices.add(new Invoice());
        invoices.get(7).setCustomer("Sumito");
        invoices.get(7).setId(8);
        invoices.get(7).setAmount(100);
        invoices.get(7).setTitle("Master");

        invoices.add(new Invoice());
        invoices.get(8).setCustomer("Phil");
        invoices.get(8).setId(9);
        invoices.get(8).setAmount(900);
        invoices.get(8).setTitle("Master");

        invoices.add(new Invoice());
        invoices.get(9).setCustomer("Robert");
        invoices.get(9).setId(10);
        invoices.get(9).setAmount(1000);
        invoices.get(9).setTitle("Master");

        return invoices;

    }

}
