package Ejercicio2;

public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int characteristic = 10 + i;
            int suscriberNumber = 12345678 + i;
            int countryCode = 54 + i;

            Person person = new Person("Matías", "Olivera");

            Email email1 = new Email("matibjolivera@gmail.com");
            Email email2 = new Email("matiasolivera@gmail.com");

            PhoneNumber phoneNumber1 = new PhoneNumber(++characteristic, ++suscriberNumber, ++countryCode, LineType.CELULAR);
            PhoneNumber phoneNumber2 = new PhoneNumber(++characteristic, ++suscriberNumber, ++countryCode, LineType.FIJO);

            Pet pet1 = new Pet("Chino", "Perro");
            Pet pet2 = new Pet("Teo", "Gato");

            person.addEmail(email1);
            person.addPhoneNumber(phoneNumber1);
            person.addPet(pet1);

            person.addEmail(email2);
            person.addPhoneNumber(phoneNumber2);
            person.addPet(pet2);

            person.showAll();
            System.out.println("------------------------");
        }
    }
}
