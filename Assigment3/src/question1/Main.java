package question1;



public class Main {
	public static void main(String[] args) {
        Project project1 = new Project("P1", "Public Secutity", 23);
        Project project2 = new Project("P2", "Inverter", 13);
        Project project3 = new Project("P3", "Oxygen", 15);

        Employee e1 = new Employee("S01", "Uma", "8939383849", "TNagar", 1000);
        Employee e2 = new Employee("S02", "Padhu", "8494999933", "Ram Nagar", 2000);
        Employee e3 = new Employee("S03", "Leena", "9383345633", "Vijayaram", 1500);

        ProjectSerializer projectSerializer = new ProjectSerializer();
        projectSerializer.elist1.add(e1);
        projectSerializer.elist1.add(e2);
        projectSerializer.elist1.add(e3);

        Employee e4 = new Employee("S04", "SwathiVijay", "999993933", "P.V koil street", 3000);
        Employee e5 = new Employee("S05", "Subha", "8989898933", "Indiranagar", 2000);
        Employee e6 = new Employee("S06", "Sumathi", "9345493933", "Koturram", 1750);

        projectSerializer.elist2.add(e4);
        projectSerializer.elist2.add(e5);
        projectSerializer.elist2.add(e6);

        Employee e7 = new Employee("E007", "Chandru", "9383978933", "Koala", 4000);
        Employee e8 = new Employee("E008", "Suji", "9383992133", "papanasam", 3000);
        Employee e9 = new Employee("E009", "balu", "9345193933", "R.Nagar", 2000);

        projectSerializer.elist3.add(e7);
        projectSerializer.elist3.add(e8);
        projectSerializer.elist3.add(e9);

        projectSerializer.projectMap1.put(project1, projectSerializer.elist1);
        projectSerializer.projectMap1.put(project2, projectSerializer.elist2);
        projectSerializer.projectMap1.put(project3, projectSerializer.elist3);

        projectSerializer.serializeProjectDetails(projectSerializer.projectMap1);
        projectSerializer.deserializeProjectDetails();
    }
}






