public class Employee {
    String name;
    int workHours,hireYear,bonus;
    double salary,tax,raise;
    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        System.out.println("ismi:"+name);
        System.out.println("maaşı:"+salary);
        System.out.println("haftalık çalışma saati:"+workHours);
        System.out.println("İşe giriş yılı:"+hireYear);
    }

    double tax(){
        if (this.salary<5000){
           return 0;
       }else{
            tax=(this.salary*3)/100;
            System.out.print("alınan vergi:");
           return tax;
       }
    }
    int bonus(){
        if (this.workHours<=40){
            return 0;
        }else {
            bonus=(this.workHours-40)*100;
            System.out.print("çalışma bonusu:");
            return bonus;
        }
    }
    double raiseSalary(){
        int year=2021-this.hireYear;
        if (year<10){
            raise=this.salary/20;
        } else if (year>=10&&year<20) {
            raise=this.salary/10;
        }else {
            raise=(this.salary*15)/100;
        }
        System.out.print("maaşa yapılacak zam:");
        return raise;
    }

    @Override
    public String toString() {
        System.out.println(tax());
        System.out.println(bonus());
        System.out.println(raiseSalary());
        int result= (int) (this.salary+bonus+raise-tax);
        System.out.println("Toplam maaş:"+result+"$");
        return null;
    }
}
