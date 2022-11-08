package PC;

import java.util.ArrayList;
import java.util.List;

public class ComputerRunner {
    public ComputerRunner() {
    }

    public static void main(String[] args) {
        List<Ram> ramList = new ArrayList();
        ramList.add(new Ram(2));
        ramList.add(new Ram(2));
        List<HardDisk> hardDiskList = new ArrayList();
        hardDiskList.add(new HardDisk(500));
        hardDiskList.add(new HardDisk(1000));
        new Computer(new Processor(), ramList, hardDiskList);
    }
}
