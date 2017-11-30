package org.jani.hello;

public class Sale {
    private Display display;

    public Sale(Display display) {
        this.display = display;
    }

    public void scan(String barcode) {
        Item item = new Item(barcode);
        String itemLine = item.name() + " $" + item.price();
        display.showLine(itemLine);
    }

    private class Item {
        public Item(String barcode) {
        }

        public String name() {
            return "Apple";
        }

        public double price() {
            return 10d;
        }
    }
}