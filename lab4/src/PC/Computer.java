package PC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Computer {
    private Processor processor;
    private List<Ram> ramList = new ArrayList();
    private List<HardDisk> hardDisksList = new ArrayList();
    private boolean power = false;

    public Computer(Processor processor, List<Ram> ramList, List<HardDisk> hardDisksList) {
        this.processor = processor;
        this.ramList = ramList;
        this.hardDisksList = hardDisksList;
    }

    public void switchOn() {
        this.power = true;
    }

    public void switchOff() {
        this.power = false;
    }

    public String checkVirus() {
        return "Checked";
    }

    public void getSizeHardDisk() {
        int size = 0;

        HardDisk hardDisk;
        for(Iterator var2 = this.hardDisksList.iterator(); var2.hasNext(); size += hardDisk.getSize()) {
            hardDisk = (HardDisk)var2.next();
        }

        System.out.println(size);
    }
}
