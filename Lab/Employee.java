   class Employee {
      long employeeId;
      String employeeName;
      String employeeAddress;
      long employeePhone;
      double basicSalary;
      double specialAllowance = 250.80;
      double Hra = 1000.50;

      public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
                      double basicSalary) {
          this.employeeId = employeeId;
          this.employeeName = employeeName;
          this.employeeAddress = employeeAddress;
          this.employeePhone = employeePhone;
          this.basicSalary = basicSalary;
      }

      public void calculateSalary() {
          double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
          System.out.println(salary);

      }

      public void calculateTransportAllowance() {
          double transportAllowance = 0.1 * basicSalary;
          System.out.println(transportAllowance);

      }
  }


  class Manager extends Employee {
      public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
          super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
          this.employeeId = employeeId;
          this.employeeName = employeeName;
          this.employeeAddress = employeeAddress;
          this.employeePhone = employeePhone;
          this.basicSalary = basicSalary;
      }

      public void calculateTransportAllowance() {
          double transportAllowance = 0.15 * basicSalary;
          System.out.println(transportAllowance);
      }
  }

  class Trainee extends Employee {
      public Trainee(long employeeId,  String employeeName,String employeeAddress,long employeePhone,
                     double basicSalary) {
          super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
          this.employeeId = employeeId;
          this.employeeName = employeeName;
          this.employeeAddress = employeeAddress;
          this.employeePhone = employeePhone;
          this.basicSalary = basicSalary;
      }
  }
  class InheritanceActivity {
      public static void main(String[] args) {
          Manager m1 = new Manager(126534, "peter",
                  "Chennai india", 237844, 65000);
          System.out.println("Manager's Basic Salary: ");
          double managerBasicSalary = m1.basicSalary;
          System.out.println(managerBasicSalary);
          System.out.println("manager's Salary: ");
          m1.calculateSalary();
          System.out.print("Manager's Travel Allowance: ");
          m1.calculateTransportAllowance();
          Trainee t1 = new Trainee(29846, "Jack", "Mumbai India",
                  442085, 45000);
          System.out.println("Trainee's Basic Salary: ");
          double traineeBasicSalary = t1.basicSalary;
          System.out.print(traineeBasicSalary);
          System.out.print("Trainee's Salary: ");
          t1.calculateSalary();
          System.out.print("Trainee's Travel Allowance: ");
          t1.calculateTransportAllowance();
      }
  }



