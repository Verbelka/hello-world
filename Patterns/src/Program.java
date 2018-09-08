public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        switch(specialty){
            case "java": return new JavaDeveloperFactory();
            case "c++" : return new CppDeveloperFactory();
            default: throw new RuntimeException(specialty + " is unknown");
        }
    }
}
