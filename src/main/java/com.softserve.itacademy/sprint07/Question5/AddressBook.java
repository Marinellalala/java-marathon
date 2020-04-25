package com.softserve.itacademy.sprint07.Question5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class AddressBook implements Iterable {
    private NameAddressPair[] addressBook;
    private int counter = 0;


    public AddressBook(int capacity) {
        addressBook = new NameAddressPair[capacity];
    }

    public boolean create(String firstName, String lastName, String address) {
        boolean isCreated = false;
        if ((firstName == null) || (lastName == null)) return isCreated;

        //      if firstName,lastName exist
        if (counter > 0) {
            for (NameAddressPair ab : addressBook) {
                if (ab != null) {
                    if (ab.person.firstName.equals(firstName) && ab.person.lastName.equals(lastName)) {
                        return isCreated;
                    }
                }
            }
        }

//      Create new addressPair
        NameAddressPair addressPair = new NameAddressPair(new NameAddressPair.Person(firstName, lastName), address);
        addressBook[counter] = addressPair;
        counter++;
        isCreated = true;

//      Increase array capacity if needed
        if (counter == addressBook.length) {
            NameAddressPair[] extendedArr = new NameAddressPair[counter * 2];
            for (int i = 0; i < addressBook.length; i++) {
                extendedArr[i] = addressBook[i];
            }
            addressBook = extendedArr;
        }
        return isCreated;
    }

    public String read(String firstName, String lastName) {
//        String readAddress = "";
        for (NameAddressPair address : addressBook) {
            if (address != null) {
                if (address.person.firstName.equals(firstName) && address.person.lastName.equals(lastName)) {
                    return address.address;
                }
            }
        }
        return null;
    }

    public boolean update(String firstName, String lastName, String address) {
        boolean isUpdated = false;
        if ((firstName == null) || (lastName == null)) return false;
        for (NameAddressPair ad : addressBook) {
            if (ad != null) {
                if (ad.person.firstName.equals(firstName) && ad.person.lastName.equals(lastName)) {
                    System.out.println(ad.address = address);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean delete(String firstName, String lastName) {
        boolean isDeleted = false;
        if ((firstName == null) || (lastName == null)) return false;
        for (NameAddressPair ad : addressBook) {
            if (ad != null) {
                if (ad.person.firstName.equals(firstName) && ad.person.lastName.equals(lastName)) {
                    ad.setAddress(null);
                    isDeleted = true;
                    counter--;
                }
            }
        }
        return isDeleted;
    }

    public int size() {
        return counter;
    }

    public void sortedBy(SortOrder order) {
        switch (order) {
            case ASC:
                Arrays.sort(addressBook, new Comparator<NameAddressPair>() {
                    @Override
                    public int compare(NameAddressPair p1, NameAddressPair p2) {
                        if (p1 == null || p2 == null) return 0;
                        return p1.person.getFirstName().concat(p1.person.lastName).compareTo(p2.person.getFirstName().concat(p2.person.lastName));
                    }
                });
                break;
            case DESC:
                Arrays.sort(addressBook, new Comparator<NameAddressPair>() {
                    @Override
                    public int compare(NameAddressPair p1, NameAddressPair p2) {
                        if (p1 == null || p2 == null) return 0;
                        return p2.person.getFirstName().concat(p2.person.lastName).compareTo(p1.person.getFirstName().concat(p1.person.lastName));
                    }
                });
                break;
        }
    }


    @Override
    public Iterator iterator() {
        return new AddressBookIterator();
    }

    private class AddressBookIterator implements Iterator {

        private int counter = 0;

        @Override
        public boolean hasNext() {
            boolean isNextPresent = false;
            if (addressBook != null && size() > 0) {
                if (counter < size()) {
                    isNextPresent = true;
                }
            }
            return isNextPresent;
        }

        @Override
        public String next() {
            String record = "";
            NameAddressPair addressPair;
            if (addressBook != null) {
                if (size() > 0) {
                    addressPair = addressBook[counter];
                    record = "First name: " + addressPair.person.firstName + ", Last name: "
                            + addressPair.person.lastName + ", Address: " + addressPair.address;
                }
            }
            counter++;
            return record;
        }

    }

    private static class NameAddressPair {

        private final Person person;
        private String address;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        private NameAddressPair(Person person, String address) {
            this.person = person;
            this.address = address;
        }

        @Override
        public String toString() {
            return "NameAddressPair{" +
                    "person=" + person +
                    ", address='" + address + '\'' +
                    '}';
        }

        private static class Person {

            private String firstName;
            private String lastName;

            private Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            //TODO might be removed getters and setters
            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Person)) return false;

                Person person = (Person) o;

                if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
                return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
            }

            @Override
            public int hashCode() {
                int result = firstName != null ? firstName.hashCode() : 0;
                result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
                return result;
            }

        }
    }


    @Override
    public String toString() {
        return "AddressBook{" +
                "addressBook=" + addressBook +
                '}';
    }

}

enum SortOrder {
    ASC,
    DESC
}
