public class Main {
    public static void main(String[] args) {

        Employee[] employeesList = new Employee[10];

        employeesList[0] = new Employee("Иванов Иван Иванович", 1, 70500);
        employeesList[1] = new Employee("Петров Петр Петрович", 1, 55250);
        employeesList[2] = new Employee("Сидоров Сидор Сидорович", 1, 52900);
        employeesList[3] = new Employee("Кузнецов Кузьма Кузьмич", 2, 77200);
        employeesList[4] = new Employee("Васильев Василий Васильевич", 2, 49900);
        employeesList[5] = new Employee("Попов Евгений Евгеньевич", 3, 81000);
        employeesList[6] = new Employee("Смирнов Андрей Андреевич", 3, 33400);
        employeesList[7] = new Employee("Лебедев Сергей Сергеевич", 4, 99500);
        employeesList[8] = new Employee("Морозов Дмитрий Дмитриевич", 5, 88100);
        employeesList[9] = new Employee("Соколов Илья Ильич", 5, 63800);

        printEmployeesList(employeesList);
    }
    public static void printEmployeesList (Employee[] employeesList) {
        for (int i = 0; i < employeesList.length; i++) {
            System.out.println(employeesList[i]);
        }
    }

}
