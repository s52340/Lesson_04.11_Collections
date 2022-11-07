package org.campus02.thenewsocialmedia;

public class SocialNetworkApp {

    public static void main(String[] args) {

        Profile susi = new Profile("susi.sorglos@test.com", 29,
                "Susi Sorglos", "5612..", 3900);

        susi.printPublicPage(AccessRoles.Platform);

        Profile max = new Profile("max.mustermann@test.com", 31,
                "Max Mustermann", "2341...", 2800);

        max.printPublicPage(AccessRoles.Self);
        System.out.println();

        susi.setBestFriend(max);
        susi.printPublicPage(AccessRoles.RegisteredCustomer);
    }
}
