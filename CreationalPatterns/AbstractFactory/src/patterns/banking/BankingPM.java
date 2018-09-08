package patterns.banking;

import patterns.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageCode() {
        System.out.println("Banking PM manages banking project...");
    }
}
