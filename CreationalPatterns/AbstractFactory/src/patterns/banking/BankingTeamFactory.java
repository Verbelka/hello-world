package patterns.banking;

import patterns.Developer;
import patterns.ProjectManager;
import patterns.ProjectTeamFactory;
import patterns.Tester;
import patterns.banking.BankingPM;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
