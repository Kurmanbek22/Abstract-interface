import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student[] student ={
                new Student("Kurmanbek","Abdullaev",'M', LocalDate.of(2024,4,1), new School("Peaksoft hous","Bishkek",LocalDate.of(2020,1,1))),
                new Student("Omurzak","Soorbaev",'M', LocalDate.of(2022,9,1), new Univercity("Manas","Bishkek",LocalDate.of(1920,1,1))),
                new Student("Kasiet","Kubandykova",'J', LocalDate.of(2020,1,1), new Univercity("Manas ","Bishkek",LocalDate.of(2000,1,1))),
                new Student("Asan","Asanov",'M', LocalDate.of(2020,9,1), new Collage("Politex","Bishkek",LocalDate.of(1980,1,1))),
                new Student("Uson","Usenov",'M', LocalDate.of(2023,9,1), new Univercity("BGU","Bishkek",LocalDate.of(2001,1,1))),
                new Student("Batma","Abdullaev",'J', LocalDate.of(2024,2,1), new Collage("MUK","Bishkek",LocalDate.of(1982,1,1))),
                new Student("Zura","Abdullaev",'J', LocalDate.of(2019,3,1), new Univercity("Ata turk","Bishkek",LocalDate.of(1970,1,1))),
                new Student("Baltabai","Abdullaev",'M', LocalDate.of(2018,4,1), new Collage("MUK","Bishkek",LocalDate.of(1982,1,1))),
                new Student("Teshebai","Abdullaev",'M', LocalDate.of(2019,4,1), new Collage("Politex","Bishkek",LocalDate.of(1980,1,1))),
                new Student("Askarali","Abdullaev",'M', LocalDate.of(2020,4,1), new School(" Peaksoft hous","Bishkek",LocalDate.of(2020,1,1))),
        };
getInfo(student);
    }
    public static void getInfo(Student[]students){
        for (Student student:students){
            int okuganJyly=LocalDate.now().getYear()-student.getDateOfStart().getYear();
            System.out.println("Аты "+student.getName()+" Фамилясы "+ student.getSurname()+" Окуган жери "+student.getEducationCenter().getName()+" окуганына "+okuganJyly+" болду");
        }
    }
}