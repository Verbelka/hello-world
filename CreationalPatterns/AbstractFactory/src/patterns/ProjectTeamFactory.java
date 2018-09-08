package patterns;

import patterns.Developer;
import patterns.ProjectManager;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
