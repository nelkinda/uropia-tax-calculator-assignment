package com.nelkinda.template.lib.unit;

import com.nelkinda.template.lib.acceptance.Bill;
import com.nelkinda.template.lib.acceptance.BillService;
import com.nelkinda.template.lib.acceptance.Item;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SalesTaxStepDefs {
    private List<Item> cart = new ArrayList<>();
    private BillService billService = new BillService();

    @Given("the shopping cart contains the following items:")
    public void shoppingCartWithItems(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        for (Map<String, String> entry : dataTable.asMaps()) {
            cart.add(new Item(entry.get("Item")));
        }
    }

    @When("generating the bill")
    public void generateBill() {
        Bill bill = billService.generateBill(cart);
    }
}
