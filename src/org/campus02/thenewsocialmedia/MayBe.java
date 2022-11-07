package org.campus02.thenewsocialmedia;

public class MayBeCreditCardNumber {
    //Vielleicht darf ich Nummer ausgeben

    private String creditCardNumber;
    private AccessRoles neededAccessRole;

    public MayBeCreditCardNumber(String creditCardNumber) {  //Konstruktor
        this.creditCardNumber = creditCardNumber;
        this.neededAccessRole = AccessRoles.ExternalUser;  //jeder darf Nr. sehen
    }

    public void deliverValue(AccessRoles accesser){  //accesser = wer gerade auf Profil zugreift
        /*if (accesser == AccessRoles.Platform){
            System.out.println(creditCardNumber);
        }
         else if (accesser == AccessRoles.ExternalUser){
            System.out.println("forbidden");
        }
         else if (accesser == AccessRoles.RegisteredCustomer) {
            System.out.println("forbidden");
        }
         else if (accesser == AccessRoles.BestFriend) {
            System.out.println("forbidden");

        }
         else if (accesser == AccessRoles.Self) {
            System.out.println(creditCardNumber);
        }
         else {
            System.out.println("forbidden");
        }*/

        // jetzt mit switch        -- ähnlich wie if Abfrage - aber schöner/besser lesbar
        //                            macht es nur einmal - weil Abfrage - keine Schleife
        switch (accesser) {
            case Platform:
            case Self:                     //AccessRoles.Self !!
                System.out.println(creditCardNumber);
                break;
            case ExternalUser:
            case RegisteredCustomer:
            case BestFriend:                  //AccessRoles.BestFriend
                System.out.println("forbidden");
                break;
            default:                         // dürfte eigentlich nicht eintreten - ist nur zur Sicherheit wenn ich etwas nicht mit Cases abgedeckt habe
                System.out.println("not allowed");
        }
    }

}
