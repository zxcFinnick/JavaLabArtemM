package Task10;

public class Shop implements Interface {
    private int space = 10;
    private Computer[] computer = new Computer[space];
    private int amount;

    Shop(int amount) {
        if (amount > 10) {
            this.amount = 10;
        }
        this.amount = amount;

        for (int i = 0; i < amount; i++) {
            computer[i].getExistence();
        }
    }


    public double getAmount() {
        return this.amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void addComputer(int a) {
        if ((this.amount + a) > 10) {
            this.amount = 10;
        }
        this.amount += a;
    }

    @Override
    public void delComputer(int a) {
        if ((this.amount - a) < 0) {
            this.amount = 0;
        }
        this.amount -= a;
    }

    @Override
    public void findComputer(int a) {
        if (a < 0 || a > 10) {
            System.out.println("Error");
        } else if (!computer[a].getExistence()) {
            System.out.println("Êîìïüþòåðà " + a + " íåò â íàëè÷èè");
        }
        System.out.println("Êîìïüþòåð " + a + " åñòü íà ñêëàäå");
    }

    @Override
    public String toString() {
        return "{" + "Â ìàãàçèíå: " + amount + " êîìïüþòåðîâ}";
    }
}
