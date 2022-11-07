package org.campus02.thenewsocialmedia;

public class Profile {

    private String eMail;
    private int age;
    private String fullname;
    private MayBe<String> creditCardNumber;  //vorher String, danach auf MayBeCred... umgeändert!
    private MayBe<Double> salary;             // Gehalt

    private Profile bestFriend;         // 1 besten Freund hat jeder (einfacher wie Array)

    // nicht adresse - Objekt der realen welt - 4 Zeilen - in eigene Klasse machen :)


    public Profile(String eMail, int age, String fullname, String creditCardNumber, double salary) {
        this.eMail = eMail;
        this.age = age;
        this.fullname = fullname;
        this.creditCardNumber = new MayBe<String>(creditCardNumber); //vorher = creditCardNumber
        this.salary = new MayBe<Double>(salary); //vorher = salary;
    }

    public void printPublicPage(AccessRoles role){        // int role = access role
        System.out.println("My Profile");
        System.out.println("eMail = " + eMail);
        if (role == AccessRoles.BestFriend || role == AccessRoles.Self){
            System.out.println("age = " + age);
        }
        System.out.println("fullname = " + fullname);

       /* if (role == AccessRoles.Platform || role == AccessRoles.Self){
            System.out.println("creditCardNumber = " + creditCardNumber);
        -- vorher  jetzt creditCardNumber.deiver ... }*/
        creditCardNumber.deliverValue(role);

        System.out.println("salary = " + salary);
        System.out.println("bestFriend = " + bestFriend);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "eMail='" + eMail + '\'' +
                ", age=" + age +
                ", fullname='" + fullname + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", salary=" + salary +
                ", bestFriend=" + bestFriend +
                '}';
    }

    public void setBestFriend(Profile bestFriend) {          // Setter
        this.bestFriend = bestFriend;
    }
}
